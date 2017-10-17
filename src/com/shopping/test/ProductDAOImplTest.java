package com.shopping.test;

import com.shopping.dao.IProductDAO;
import com.shopping.dao.impl.ProductDAOImpl;
import com.shopping.domain.Product;
import org.junit.Test;


import java.math.BigDecimal;
import java.util.List;

/** 
* ProductDAOImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>2017</pre>
* @version 1.0 
*/ 
public class ProductDAOImplTest {
    private IProductDAO dao =new ProductDAOImpl();

/** 
* 
* Method: save(Product obj) 
* 
*/ 
@Test
public void testSave() throws Exception { 
    //Product product = new Product();
    Product product = dao.get(2L);
    System.out.println(product);
    product.setProductName("机械键盘");
    product.setCostPrice(new BigDecimal("100"));
    product.setSalePrice(new BigDecimal("500"));
    dao.save(product);

} 

/** 
* 
* Method: update(Product obj) 
* 
*/ 
@Test
public void testUpdate() throws Exception {
    Product product = dao.get(22L);
product.setProductName("触控板");
System.out.println(product);
    dao.update(product);
} 

/** 
* 
* Method: delete(Long id) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
    dao.delete(22L);
} 

/** 
* 
* Method: get(Long id) 
* 
*/ 
@Test
public void testGet() throws Exception {
    Product product = dao.get(1L);
    System.out.println(product);
}

/** 
* 
* Method: list() 
* 
*/ 
@Test
public void testList() throws Exception { 
    List<Product> list = dao.list();
    for(Product ele:list){
        System.out.println(ele);
    }
} 


} 
