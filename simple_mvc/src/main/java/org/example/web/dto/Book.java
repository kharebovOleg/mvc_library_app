package org.example.web.dto;

import javax.validation.constraints.*;

public class Book {
    private Integer id;
    @NotEmpty(message = "field must not be empty")
    @Pattern
            (regexp = "^[а-яА-ЯёЁa-zA-Z'-]+ ?[а-яА-ЯёЁa-zA-Z'-]+ ?[а-яА-ЯёЁa-zA-Z'-]+$",
            message = "field must be valid")
    private String author;
    @NotEmpty
    private String title;
    @Digits(integer = 4, fraction = 0)
    @Min(value = 5)
    @NotNull
    private Integer size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size +
                '}';
    }
}
