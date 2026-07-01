package idh.java;

import java.io.IOException;

import idh.java.util.NameGenerator;

public class StudentFactory {
	static int studentId = 1;
	
	static NameGenerator nameGenerator = null;
	
	static Student createNewStudent() {
		try {
			if (nameGenerator == null) {
				nameGenerator = new NameGenerator();
			}
			Student student = new Student(nameGenerator.getName(), studentId++);
			return student;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
