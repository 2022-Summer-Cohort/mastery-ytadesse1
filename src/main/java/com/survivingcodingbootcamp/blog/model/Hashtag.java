package com.survivingcodingbootcamp.blog.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private Long id;
    private String hashtagName;

    @ManyToMany (mappedBy = "hashtags")
    private Collection<Post> posts;
//  it can mess up the mapping, and the instances of the mapping

    public Hashtag() {
    }

    public Hashtag(String hashtagName, Post... posts) {
        this.hashtagName = hashtagName;
        this.posts = Arrays.asList(posts);
    }

    public Long getId() {
        return id;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public Collection<Post> getPosts() {
        return posts;
    }
}
