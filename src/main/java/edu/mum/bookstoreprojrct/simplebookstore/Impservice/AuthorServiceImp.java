package edu.mum.bookstoreprojrct.simplebookstore.Impservice;

import edu.mum.bookstoreprojrct.simplebookstore.models.Author;
import edu.mum.bookstoreprojrct.simplebookstore.repo.AuthorRepo;
import edu.mum.bookstoreprojrct.simplebookstore.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AuthorServiceImp implements AuthorService {


    AuthorRepo authorRepo;

    public AuthorServiceImp(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public List<Author> findAll() {
        List<Author>authors = authorRepo.findAll();
        return authors;
    }

    @Override
    public Author save(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public void deleteById(Long id) {
       authorRepo.deleteById(id);
    }

    @Override
    public Optional<Author> findById(Long id) {
        return authorRepo.findById(id);
    }

    @Override
    public Author findByName(String name) {
        return authorRepo.findByName(name);
    }
}
