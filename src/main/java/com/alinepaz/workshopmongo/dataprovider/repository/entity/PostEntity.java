package com.alinepaz.workshopmongo.dataprovider.repository.entity;

import com.alinepaz.workshopmongo.core.domain.Author;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class PostEntity {

    private String id;
    private Instant date;
    private String title;
    private String body;
    private AuthorEntity author;
}
