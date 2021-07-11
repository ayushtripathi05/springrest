package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;
import java.util.List;

@RestController
public class MyController {
     @Autowired(required = true)
     private CourseService courseService;




    @GetMapping("/home")
    public  String home()
    {
        return "This is home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return  this.courseService.getCourse();
    }

    @GetMapping("/courses/{id}")
    public  Course getCourseByid(@PathVariable int id)
    {
        return  this.courseService.getCourseById(id);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return  this.courseService.addCourse(course);
    }







}
