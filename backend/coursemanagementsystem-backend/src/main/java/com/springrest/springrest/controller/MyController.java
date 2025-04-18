package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@CrossOrigin("*")
@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	
	
	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();	
	}
	
	// get course by id
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	// add course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
	    return this.courseService.addCourse(course);
	}

	
	//delete course by id
	@DeleteMapping("/course/{courseId}")
	public Course deleCourseById(@PathVariable String courseId) {
		return this.courseService.deleteCourseById(Long.parseLong(courseId));
	}
	
	// update course
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@PathVariable Long courseId, @RequestBody Course course) {
	    course.setId(courseId); 
	    return this.courseService.updateCourse(course);
	}
}
