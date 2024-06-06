package com.techplement.techplquoteservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "quotes")
public class Quotes {

    @Id
    @Field("_id")
    @JsonIgnore
    private String id;
    private int quoteid;
    private String author;
    private String quote;

}
