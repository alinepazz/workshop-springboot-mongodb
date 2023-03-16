package com.alinepaz.workshopmongo.core.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String id;

    private String name;

    private String email;

    private List<Post> posts = new ArrayList<>();

    public User(){
    }

    public User(String id, String name, String email, List<Post>posts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.posts = posts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
