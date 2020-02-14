package edu.mum.bookstoreprojrct.simplebookstore.repo;

import edu.mum.bookstoreprojrct.simplebookstore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    Book findByTitle(String title);
}
