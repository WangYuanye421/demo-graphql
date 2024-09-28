package org.wyy.demographql.service;

import org.springframework.stereotype.Service;
import org.wyy.demographql.entity.Author;
import org.wyy.demographql.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author yuanyewang515@gmail.com
 * @since v1.0
 **/
@Service
public class BookService {
    private static final List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("1", "book1", 197,
                new Author(UUID.randomUUID().toString(), "A", "a")));
        books.add(new Book("2", "book2", 198,
                new Author(UUID.randomUUID().toString(), "B", "b")));
        books.add(new Book("3", "book3", 199,
                new Author(UUID.randomUUID().toString(), "C", "c")));
    }

    public Book createBook(String name, int pageCount, String authorFirstName, String authorLastName) {
        Book book = new Book(UUID.randomUUID().toString(), name, pageCount,
                new Author(UUID.randomUUID().toString(), authorFirstName, authorLastName));
        books.add(book);
        return book;
    }

    public Book getById(String id) {
        return books.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }
}
