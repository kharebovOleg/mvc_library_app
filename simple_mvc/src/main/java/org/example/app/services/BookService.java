package org.example.app.services;

import org.apache.log4j.Logger;
import org.example.web.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {

    private final ProjectRepository<Book> bookRepo;
    private final Logger logger = Logger.getLogger(BookService.class);

    @Autowired
    public BookService(ProjectRepository<Book> bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.retreiveAll();
    }

    public void saveBook(Book book) {
        if(!Objects.equals(book.getAuthor(), "") || !Objects.equals(book.getTitle(), "") || book.getSize() != null)
        {
            bookRepo.storeBook(book);
        }
    }

    public boolean removeBookById(String bookIdToRemove) {
        return bookRepo.removeItemById(bookIdToRemove);
    }

    public boolean removeBookByRegex(String regexToRemove) {
        return bookRepo.removeItemByRegex(regexToRemove);
    }

    private void defaultInit(){
        logger.info("default Init in book service");
    }

    private void defaultDestroy(){
        logger.info("default Destroy in book service");
    }
}
