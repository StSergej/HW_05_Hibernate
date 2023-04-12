package org.example.ex_04.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "authors", schema = "library")
public class AuthorsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "authors", fetch = FetchType.EAGER)
    private List<BooksEntity> books = new ArrayList<>();


    public AuthorsEntity() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BooksEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BooksEntity> books) {
        this.books = books;
    }


    @Override
    public String toString() {
        return "AuthorsEntity{" + " id = " + id +
                ", lastName = " + lastName  + ", name = " + name + " }";
    }
}
