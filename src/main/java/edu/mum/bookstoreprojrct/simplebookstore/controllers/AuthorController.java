package edu.mum.bookstoreprojrct.simplebookstore.controllers;

import edu.mum.bookstoreprojrct.simplebookstore.models.Author;
import edu.mum.bookstoreprojrct.simplebookstore.models.Book;
import edu.mum.bookstoreprojrct.simplebookstore.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {
     private AuthorService authorService;


    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author){
        return authorService.save(author);
    }

    @DeleteMapping("/delete")
    public void remove(@RequestBody Long id){
        authorService.deleteById(id);
    }
    @RequestMapping("/searchById")
    public Optional<Author> findById(@RequestParam("id") Long id){
        return authorService.findById(id);
    }
    @GetMapping("/list")
    public List<Author> findAll(){
        return authorService.findAll();
    }

    @GetMapping("/searchByTitle")
    public Author findByName(@RequestParam("name") String name){
        return authorService.findByName(name);
    }

}
