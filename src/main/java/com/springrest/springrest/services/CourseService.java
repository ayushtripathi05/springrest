package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {
      public List<Course> getCourse();
      public Course getCourseById(int x);
      public  Course addCourse(Course course);

}
