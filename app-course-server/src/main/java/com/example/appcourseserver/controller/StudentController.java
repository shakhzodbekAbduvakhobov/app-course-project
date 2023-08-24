package com.example.appcourseserver.controller;

import com.example.appcourseserver.entity.Student;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    //Valid anatotatsiyasi @NOTNULL ni ishlatish uchun qoyilgan
    @PostMapping
    public HttpEntity<?> addStudent(@Valid @RequestBody Student student){

    }
}
