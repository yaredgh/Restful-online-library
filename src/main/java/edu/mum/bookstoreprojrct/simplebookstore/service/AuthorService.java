package edu.mum.bookstoreprojrct.simplebookstore.service;

import edu.mum.bookstoreprojrct.simplebookstore.models.Author;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AuthorService {
    List<Author> findAll();
    Author save(Author author);
    void deleteById(Long id);
    Optional<Author> findById(Long id);
    Author findByName(String name );
}
