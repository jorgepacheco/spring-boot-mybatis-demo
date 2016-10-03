package com.autentia.mappers;

import com.autentia.SpringBootMyBatisIntegrationDemo;
import com.autentia.model.Course;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.Matchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootMyBatisIntegrationDemo.class)
public class CourseMapperIntegrationTest {

    @Autowired
    private CourseMapper courseMapper;

    //@Test
    public void getCourses() throws Exception {
        List<Course> courses = courseMapper.getCourses();
        assertThat(courses, hasSize(2));
    }

}
