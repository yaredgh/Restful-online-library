package edu.mum.bookstoreprojrct.simplebookstore.service;

import edu.mum.bookstoreprojrct.simplebookstore.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface BookService  {

    List<Book> findAll();
    Book save(Book book);
    Optional<Book> deleteById(Long id);
    Optional<Book> findById(Long id);
    Book findByTitle(String title );

}
