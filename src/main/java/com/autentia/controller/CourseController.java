package com.autentia.controller;

import com.autentia.model.Course;
import com.autentia.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jorgepacheco on 27/9/16.
 */
@RestController
public class CourseController {

    private final CourseService service;

    @Autowired
    public CourseController(CourseService service) {
        this.service = service;
    }

    @RequestMapping(value = "/courses")
    public List<Course> getCourses() throws Exception {

        final List<Course> courses = service.getCourses();
        return courses;

    }
}
