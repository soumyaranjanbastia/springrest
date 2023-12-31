package com.Springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springrest.springrest.dao.CourseDao;
import com.Springrest.springrest.entities.Course;

@Service
public class CourseServicesImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    // List<Course> list;

    public CourseServicesImpl() {
        // list = new ArrayList<>();
        // list.add(new Course(101, "java core Course", "this course contain basic
        // content of java"));
        // list.add(new Course(102, "Spring boot Course", "Creating rest api using
        // spring boot"));

    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        // Course c = null;
        // for (Course course : list) {
        // if (course.getId() == courseId) {
        // c = course;
        // break;
        // }
        // }
        CourseDao courseDao = CourseDao.getInstance();
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        // list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updatCourse(Course course) {
        // list.forEach(e -> {
        // if (e.getId() == course.getId) {
        // e.setTitle(course.getTitle());
        // e.setDescription(course.getDescription());
        // }

        // });
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        // list = this.list.stream().filter(e -> e.getId() !=
        // parseLong).collect(Collectors.toList());
        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }

}