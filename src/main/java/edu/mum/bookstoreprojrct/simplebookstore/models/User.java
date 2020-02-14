package edu.mum.bookstoreprojrct.simplebookstore.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
public class User extends Person {

    private String userName;


    @ManyToOne(cascade = CascadeType.ALL)
    private Book book;

    public User() {
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
