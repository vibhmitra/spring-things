package com.vibhmitra.springapi.blogpost;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.time.*;

@RestController
@RequestMapping(path = "api/v1/blogposts")
public class BlogPostController {

    @GetMapping
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
