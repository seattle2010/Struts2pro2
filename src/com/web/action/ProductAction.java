package com.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.shopping.dao.IProductDAO;
import com.shopping.dao.IProductDirDAO;
import com.shopping.dao.impl.ProductDAOImpl;
import com.shopping.dao.impl.ProductDirDAOImpl;
import com.shopping.domain.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//处理product相关的请求操作
public class ProductAction extends ActionSupport {
	private IProductDAO dao = new ProductDAOImpl();
	private IProductDirDAO dirDAO = new ProductDirDAOImpl();
	@Getter
	@Setter
	private Product product = new Product();
	//商品列表
	@Override
	public String execute() throws Exception {
		List<Product> list = dao.list();
		//把数据存储在valueStack的context区域
		ActionContext.getContext().put("products", list);
		return "list";
	}
		//保存 更新操作
		public String save(){
		if(product.getId() == null){
			dao.save(product);
		}
		return "success";
	}
	//进入编辑界面

	@Override
	public String input() throws Exception {
			//查询出所有商品分类
		ActionContext.getContext().put("dirs",dirDAO.list());
		return INPUT;
	}
	//删除操作
	public String delete() {
			System.out.println(product.getId());
			dao.delete(product.getId());
			return SUCCESS;
	}
}
