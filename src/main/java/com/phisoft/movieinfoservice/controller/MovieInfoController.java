package com.phisoft.movieinfoservice.controller;

import com.phisoft.movieinfoservice.dto.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable("id") String id){
        return new Movie(id,"God-father");
    }





}
