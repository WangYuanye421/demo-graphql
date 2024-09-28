package org.wyy.demographql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wyy.demographql.entity.Book;
import org.wyy.demographql.service.BookService;

/**
 * @author yuanyewang515@gmail.com
 * @since v1.0
 **/
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    // @SchemaMapping(typeName = "Query", value = "getById")
    @QueryMapping(value = "getById")
    public Book getById2(@Argument String id) {
        return bookService.getById(id);
    }

    @MutationMapping(value = "createBook")
    public Book createBook(@Argument String name,
                           @Argument int pageCount,
                           @Argument String authorFirstName,
                           @Argument String authorLastName) {
        return bookService.createBook(name,pageCount,authorFirstName,authorLastName);
    }
}
