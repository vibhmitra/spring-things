package com.vibhmitra.springapi.blogpost;

import java.util.List;

import org.springframework.stereotype.Service;

import java.time.*;

@Service
public class BlogPostService {
    public List<BlogPost> getPosts() {
        return List.of(
                new BlogPost(
                        1L,
                        "First Blog",
                        "Momo",
                        LocalDate.of(2024, Month.SEPTEMBER, 28),
                        1));
    }
}
