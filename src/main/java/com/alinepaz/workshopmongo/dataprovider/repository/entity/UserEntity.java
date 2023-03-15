package com.alinepaz.workshopmongo.dataprovider.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class UserEntity {


    @Id
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @DBRef(lazy = true)
    private List<PostEntity> posts = new ArrayList<>();
}
