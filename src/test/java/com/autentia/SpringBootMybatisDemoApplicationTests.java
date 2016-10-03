package com.autentia;

import com.autentia.mappers.CourseMapper;
import com.autentia.model.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = SpringBootMyBatisIntegrationDemo.class)
public class SpringBootMybatisDemoApplicationTests {

	@Autowired
	private CourseMapper courseMapper;
	//@Test
	public void test() {
		List<Course> output = courseMapper.getCourses();

		System.out.println(output);
	}

}
