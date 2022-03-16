package guru.qa;

import java.util.Objects;

public class Book {

    String author;
    String text;

    public Book(String author, String text) {
        this.author = author;
        this.text = text;
    }

    String doReadBook() {
        return "книга прочитана от автора: " + author + " с текстом: " + text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(text, book.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text);
    }
}
