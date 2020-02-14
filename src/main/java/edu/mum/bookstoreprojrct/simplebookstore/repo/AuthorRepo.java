package edu.mum.bookstoreprojrct.simplebookstore.repo;

import edu.mum.bookstoreprojrct.simplebookstore.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {
    Author findByName(String name);
}
