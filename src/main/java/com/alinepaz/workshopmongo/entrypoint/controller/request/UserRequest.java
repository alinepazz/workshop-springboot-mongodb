package com.alinepaz.workshopmongo.entrypoint.controller.request;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class UserRequest {

    private String id;

    private String name;

    private String email;

}
