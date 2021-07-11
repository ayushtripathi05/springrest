package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService {

  //  List<Course> list;
    @Autowired
    private CourseDao courseDao;

    public  CourseServiceImp() {

      /*  list=new ArrayList<>();
        list.add(new Course(1 , "Spring", "study  about spring"));
        list.add(new Course(2 , "Java" , "Study  about java")); */



    }


    @Override
    public List<Course> getCourse()
    {
      //  return  list;
        return  courseDao.findAll();
    }

    @Override
    public Course getCourseById(int x)
    {
      /*  for(Course course : list)
        {
            if(course.getId()==x)
                return  course;
        } */

        return courseDao.getOne(x);
    }


    @Override
    public  Course addCourse(Course course)
    {
       // list.add(course);
        courseDao.save(course);
        return   course;


    }





}
