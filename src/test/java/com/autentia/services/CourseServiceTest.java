package com.autentia.services;

import com.autentia.mappers.CourseMapper;
import com.autentia.model.Course;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
/**
 * Created by jorgepacheco on 3/6/16.
 */
public class CourseServiceTest {

    private CourseMapper courseMapper = mock(CourseMapper.class);

    @Test
    public void shouldReturnAllCourses(){
        //given
        CourseService service = new CourseService(courseMapper);
        when(courseMapper.getCourses()).thenReturn(buildListCourses());
        //when
        List<Course> courses = service.getCourses();
        //then
        MatcherAssert.assertThat(courses, is(not(empty())));
        verify(courseMapper).getCourses();
    }

    private List<Course> buildListCourses() {
        return Arrays.asList(new Course("Test Course",10));
    }

}