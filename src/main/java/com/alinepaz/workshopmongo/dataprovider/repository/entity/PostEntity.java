package com.alinepaz.workshopmongo.dataprovider.repository.entity;

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
    private UserEntity author;
}
