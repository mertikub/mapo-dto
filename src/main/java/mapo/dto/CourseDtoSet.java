package mapo.dto;

import java.util.HashSet;
import java.util.Set;

public class CourseDtoSet {

	private Set<CourseDto> courses;
	
	public CourseDtoSet() {
		courses = new HashSet<CourseDto>();
	}
	
	public CourseDtoSet(Set<CourseDto> coursesSet) {
		this();
		courses.addAll(coursesSet);
	}
	
	public Set<CourseDto> getCourses() {
		return courses;
	}
}
