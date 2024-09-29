package com.vibhmitra.springapi.blogpost;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.*;
import java.util.List;

@Configuration
public class BlogPostConfig {

    @Bean
    CommandLineRunner commandLineRunner(BlogPostRepository repository) {
        return args -> {

            BlogPost post1 = new BlogPost(
                    "First Blog",
                    "Momo",
                    LocalDate.of(2024, Month.SEPTEMBER, 28),
                    101);
            BlogPost post2 = new BlogPost(
                    "Second Blog",
                    "Momo",
                    LocalDate.of(2024, Month.SEPTEMBER, 29),
                    102);
            BlogPost post3 = new BlogPost(
                    "Third Blog",
                    "Momo",
                    LocalDate.of(2024, Month.SEPTEMBER, 30),
                    103);
            repository.saveAll(List.of(post1, post2, post3));
        };
    }

}
