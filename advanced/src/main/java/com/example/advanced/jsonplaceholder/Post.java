package com.example.advanced.jsonplaceholder;

public class Post {
    private final Integer userId;
    private final Integer Id;
    private final String title;
    private final String body;

    public Post(Integer userId,
                Integer id,
                String title,
                String body) {
        this.userId = userId;
        Id = id;
        this.title = title;
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", Id=" + Id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
