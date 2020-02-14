package edu.mum.bookstoreprojrct.simplebookstore.controllers;

import edu.mum.bookstoreprojrct.simplebookstore.models.Book;
import edu.mum.bookstoreprojrct.simplebookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
      return bookService.save(book);
    }

    @DeleteMapping("/delete")
    public void remove(@RequestBody Long id){
        bookService.deleteById(id);
    }
    @RequestMapping("/searchById")
    public Optional<Book> findById(@RequestParam("id") Long id){
          return bookService.findById(id);
    }
    @GetMapping("/list")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/searchByTitle")
    public Book findByTitle(@RequestParam("title") String title){
        return bookService.findByTitle(title);
    }
    @DeleteMapping("/deleteByTitle")
    public void deleteByTitle(@RequestParam("title") String title){
        Book book = bookService.findByTitle(title);

        bookService.deleteById(book.getId());
    }



}
