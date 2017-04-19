package YourVision.co2015.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="lectures")
public class Lecture {
	
	@Id
	@GeneratedValue
	private int lectureNumber;
	@OneToOne
	private Course course;
	
	public Integer getLectureNumber() {
		return lectureNumber;
	}

	public void setLectureNumber(Integer lectureNumber) {
		this.lectureNumber = lectureNumber;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setLectureNumber(Course course) {
		this.course = course;
	}
}
