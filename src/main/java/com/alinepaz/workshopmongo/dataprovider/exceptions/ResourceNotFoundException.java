package com.alinepaz.workshopmongo.dataprovider.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource not found, id: " + id);
    }
}
