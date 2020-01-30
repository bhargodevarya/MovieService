package com.app;

import com.app.service.api.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieServiceAppMain implements CommandLineRunner {

    @Autowired
    private MovieService movieService;

    public static void main(String[] args) {
        SpringApplication.run(MovieServiceAppMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*System.getenv().entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " >> " + entry.getValue());
        });
        movieService.getAllMovies().forEach(System.out::println);*/
    }
}
