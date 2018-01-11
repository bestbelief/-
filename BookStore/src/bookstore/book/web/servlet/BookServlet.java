package bookstore.book.web.servlet;
import bookstore.book.dao.BookDao;
import bookstore.book.domain.Book;
import bookstore.util.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@WebServlet(name = "BookServlet",urlPatterns = "/book")
public class BookServlet extends BaseServlet {
          private BookDao bookDao = new BookDao();
          private Book book = new Book();
    public String findAll(HttpServletRequest request, HttpServletResponse response){
        List<Book> allBook = bookDao.findAll();
        request.setAttribute("allBook",allBook);
        return "f:/jsps/book/list.jsp";
    }
    public String findByCategory(HttpServletRequest request,HttpServletResponse response){
        String cid = request.getParameter("cid");
        List<Book> cateBook = bookDao.findByCategory(cid);
        request.setAttribute("cateBook",cateBook);
        return "f:/jsps/book/list.jsp";
    }
    public String load(HttpServletRequest request,HttpServletResponse response){
        String bid = request.getParameter("bid");
        Book book = bookDao.findBybid(bid);
        request.setAttribute("book",book);
        return "f:/jsps/book/desc.jsp";
    }

}
