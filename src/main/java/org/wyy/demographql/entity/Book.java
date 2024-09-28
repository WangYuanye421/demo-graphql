package org.wyy.demographql.entity;

import lombok.Data;

/**
 * @author yuanyewang515@gmail.com
 * @since v1.0
 **/
@Data
public class Book {
    private String id;
    private String name;
    private int pageCount;
    private Author author;

    public Book(String id, String name, int pageCount, Author author) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
    }
}
