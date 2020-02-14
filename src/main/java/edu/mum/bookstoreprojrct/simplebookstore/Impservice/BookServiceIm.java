package edu.mum.bookstoreprojrct.simplebookstore.Impservice;

import edu.mum.bookstoreprojrct.simplebookstore.models.Book;
import edu.mum.bookstoreprojrct.simplebookstore.repo.BookRepo;
import edu.mum.bookstoreprojrct.simplebookstore.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceIm implements BookService {


    private BookRepo bookRepo;

    public BookServiceIm(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
   }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = (List<Book>) bookRepo.findAll();
        return bookList;
    }

    @Override
    public Book save(Book book) {
      return bookRepo.save(book);
    }

    @Override
    public Optional<Book> deleteById(Long id) {
        bookRepo.deleteById(id);
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepo.findById(id);
    }

    @Override
    public Book findByTitle(String title) {
        return bookRepo.findByTitle(title);
    }
}
