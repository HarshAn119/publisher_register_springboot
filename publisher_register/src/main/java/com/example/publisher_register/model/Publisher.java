package com.example.publisher_register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data   // generates boilerplate code like getters setters equals etc;
@AllArgsConstructor // generates a constructor with arguments for all non-final fields in a class
@NoArgsConstructor  // gererates a constructor with no arguments
@ToString   // generates a toString(), which returns a string that represents the state of the object
@Document(collection = "Publisher") // mongoDB collection
public class Publisher {
    @Id // field that should be used as the identifier for the document
    private String id;
    private String name;
    private String email;
    private Integer published;
}
