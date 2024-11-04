package Homeworks.Homework_07.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Note implements Serializable {
    private String text;
    private Author author;
    private LocalDateTime time;

    public Note(String text, Author author, LocalDateTime time) {
        this.text = text;
        this.author = author;
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDateTime getTime() {
        return time;
    }
}


