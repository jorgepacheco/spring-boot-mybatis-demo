package com.autentia.services;

import com.autentia.mappers.CourseMapper;
import com.autentia.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jorgepacheco on 3/6/16.
 */

@Service
public class CourseService {


    private final CourseMapper courseMapper;

    @Autowired
    public CourseService(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }


    public List<Course> getCourses() {

        return courseMapper.getCourses();
    }
}
