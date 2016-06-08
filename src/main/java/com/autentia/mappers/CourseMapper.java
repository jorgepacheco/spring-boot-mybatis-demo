package com.autentia.mappers;


import com.autentia.model.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by jorgepacheco on 3/6/16.
 */
@Mapper
public interface CourseMapper {

    List<Course> getCourses();
}
