package edu.mum.bookstoreprojrct.simplebookstore.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author extends Person{

    @OneToMany(mappedBy = "author")
    private List<Book> book = new ArrayList<>();

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

}
