package com.alinepaz.workshopmongo.entrypoint.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {

    private String id;
    private Instant date;
    private String title;
    private String body;
    //private UserResponse author;
}
