package org.example.ex_03.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int id;
    @Column(name = "book_name")
    private String name;
    @Column(name = "author_id")
    private int authorId;

    public Book() {}

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, int authorId) {
        this.name = name;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return "Book{" + "id = " + id + ", name = " + name +
                ", authorId = " + authorId + "}";
    }
}
