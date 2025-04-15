package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course deleteCourseById(long courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        if (course.isPresent()) {
            courseRepository.deleteById(courseId);
            return course.get();
        } else {
            throw new RuntimeException("Course with ID " + courseId + " not found.");
        }
    }


    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
}
