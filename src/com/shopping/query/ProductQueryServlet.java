package com.shopping.query;

import com.shopping.dao.impl.ProductDAOImpl;
import com.shopping.domain.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ProductQueryServlet", urlPatterns = "/ProductQueryServlet")
public class ProductQueryServlet extends HttpServlet {
    private ProductDAOImpl productDAO;
    @Override
    public void init() throws ServletException {
        productDAO = new ProductDAOImpl();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
        List<Product> list = productDAO.list();
        request.setAttribute("products",list);
        request.getRequestDispatcher("/ProductQuery/productQueryList.jsp").forward(request, response);
    }

    private boolean hasLength(String str) {
        return str != null && !"".equals(str.trim());
    }

}
