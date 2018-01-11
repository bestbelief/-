package bookstore.category.web.servlet;
import bookstore.book.dao.BookDao;
import bookstore.book.domain.Book;
import bookstore.category.dao.CategoryDao;
import bookstore.category.domain.Category;
import bookstore.util.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(name = "CategoryServlet",urlPatterns = "/category")
public class CategoryServlet extends BaseServlet{

     private CategoryDao categoryDao = new CategoryDao();
    public String findAll(HttpServletRequest request, HttpServletResponse response){
        List<Category> all = categoryDao.findAll();
        request.setAttribute("all",all);
        return "f:/jsps/left.jsp";

    }

}
