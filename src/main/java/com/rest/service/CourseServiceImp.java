package com.rest.service;

import java.util.List;
import java.util.stream.Collectors;

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
	public Courses getCourse(long courseId) {
		return courseDao.getOne(courseId);
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
	public void deleteCourse(long courseId) {
		list = this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
		Courses entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}
}
