package com.alinepaz.workshopmongo.entrypoint.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String id;

    private String name;

    private String email;
}
