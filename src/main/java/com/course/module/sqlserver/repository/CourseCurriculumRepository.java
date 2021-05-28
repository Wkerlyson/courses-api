package com.course.module.sqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.module.sqlserver.entity.CourseCurriculum;

public interface CourseCurriculumRepository extends JpaRepository<CourseCurriculum, Integer> {

}
