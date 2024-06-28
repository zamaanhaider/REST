package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.CourseDao;
import com.rest.entity.Courses;

@Service
public class CourseServiceImp implements CourseService {

	@Autowired
	private CourseDao courseDao;

	List<Courses> list;

	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(int courseId) {	
		Optional<Courses> course = courseDao.findById(courseId);
		return course.get();
	}

	@Override
	public Courses addCourse(Courses course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public String deleteCourse(int courseId) {
		
		if (courseDao.existsById(courseId)) {
			courseDao.deleteById(courseId);
			return "Deleted Successfuly";
		} else {
			return "Course Not Found";
		}
	}
}
