package com.vibhmitra.springapi.blogpost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.*;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getPosts() {
        return blogPostRepository.findAll();
    }

    public void addNewBlogPost(BlogPost blogPost) {
        System.out.println(blogPost);
    }
}
