package bookstore.book.service;

import bookstore.book.dao.BookDao;
import bookstore.book.domain.Book;

import java.util.List;

public class BookService {
    private BookDao bookDao = new BookDao();
    public void findAll(){
        List<Book> books = bookDao.findAll();

    }
}
