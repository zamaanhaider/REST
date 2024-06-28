package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.entity.Courses;
import com.rest.service.CourseService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}

	// get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return courseService.getCourses();
	}

	// get single course
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable int courseId) {
		return courseService.getCourse(courseId);
	}

	// add courses
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return courseService.addCourse(course);
	}

	// update course
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course) {
		return courseService.updateCourse(course);
	}

	// delete course
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable int courseId) {
		return courseService.deleteCourse(courseId);
	}

}
