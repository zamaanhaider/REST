package com.rest.service;

import java.util.List;

import com.rest.entity.Courses;

public interface CourseService {

	public List<Courses> getCourses();

	public Courses getCourse(int courseId);

	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);

	public String deleteCourse(int courseId);

}
