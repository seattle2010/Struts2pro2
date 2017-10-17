package com.shopping.dao.impl;


import com.shopping.JDBCTemplate;
import com.shopping.dao.IProductDirDAO;
import com.shopping.domain.ProductDir;

import java.util.List;

public class ProductDirDAOImpl implements IProductDirDAO {
	public void save(ProductDir obj) {
		String sql = "INSERT INTO productdir (dirName,parent_id) VALUES(?,?)";
		JDBCTemplate.update(sql, obj.getDirName(), obj.getParent_id());
	}

	public void update(ProductDir obj) {
		String sql = "UPDATE productdir SET dirName =?,parent_id=? WHERE id = ?";
		JDBCTemplate.update(sql, obj.getDirName(), obj.getParent_id(),
				obj.getId());
	}

	public void delete(Long id) {
		String sql = "DELETE FROM productdir WHERE id = ?";
		JDBCTemplate.update(sql, id);
	}

	public ProductDir get(Long id) {
/*		List<ProductDir> list =  JDBCTemplate.query("SELECT * FROM productdir WHERE id = ?",
				new ProductDirResultSetHadnler(),id);
		if(list.size()==1){
			return list.get(0);
		}  */
		return null;
	}

	public List<ProductDir> list() {
		String sql = "SELECT * FROM productdir";
		List<ProductDir> queryall = JDBCTemplate.queryDir(sql);
		return queryall;
	}

}
