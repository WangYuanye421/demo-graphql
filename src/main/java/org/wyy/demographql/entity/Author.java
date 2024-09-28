package org.wyy.demographql.entity;

import lombok.Data;

/**
 * @author yuanyewang515@gmail.com
 * @since v1.0
 **/
@Data
public class Author {
    private String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
