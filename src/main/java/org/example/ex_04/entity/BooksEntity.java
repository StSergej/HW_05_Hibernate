package org.example.ex_04.entity;

import javax.persistence.*;

@Entity
@Table(name = "books", schema = "library")
public class BooksEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorsEntity authors;

    @Column(name = "book_name")
    private String bookName;



    public BooksEntity() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AuthorsEntity getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorsEntity authors) {
        this.authors = authors;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "BooksEntity{" + " id = " + id +
                ", authors = " + authors + ", bookName = '" + bookName  + "' }";
    }
}
