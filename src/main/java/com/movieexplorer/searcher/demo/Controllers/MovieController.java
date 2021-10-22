package com.movieexplorer.searcher.demo.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
//    localhost:8080/movies
    @GetMapping("/movies")
    public String getAllMovies() {
        return  "AllMovies";
    }
//    localhost:8080/movies/starwars
    @GetMapping("/movies/{id}")
    public String getMovie() {
        return  "one movie";
    }

//    localhost:8080/movies
    @PostMapping("/movies")
    public String createMovie(String id) {
        return  "create movie";
    }

//    localhost:8080/movies/star
    @PutMapping("/movies/{id}")
    public String updateMovie(String id) {
        return  "update movie";
    }


//    localhost:8080/movies/star
    @DeleteMapping("/movies/{id}")
    public String deleteMovie(String id) {
        return "movie deleted";
    }

}
