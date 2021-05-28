package com.course.module.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.module.postgres.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
