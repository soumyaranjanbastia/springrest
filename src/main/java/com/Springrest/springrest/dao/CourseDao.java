package com.Springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springrest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

    static CourseDao getInstance() {
        return null;
    }

}
