package com.springrest.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {}
