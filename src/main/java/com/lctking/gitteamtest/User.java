package com.lctking.gitteamtest;

public class User {
    private Long id;

    private String username;

    public User(Long id, String username) {
        if(id == null){
            throw new NullPointerException("id cannot be null");
        }
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
