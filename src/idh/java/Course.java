package idh.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import idh.java.util.NameGenerator;

public class Course implements Iterable<Student> {
	List<Student> members;
	
	int maximalNumberOfStudents = 0;
	String name;


	public Course(String name, int maximalNumberOfStudents) {
		this.members = new ArrayList<Student>();
		this.name = name;
		this.maximalNumberOfStudents = maximalNumberOfStudents;
	}
	
	public void addMember(Student student) throws Exception {
		if (this.members.size() < this.maximalNumberOfStudents) {
			this.members.add(student);
		} else 
			throw new Exception("Class full");
	}
	
	
	
	public int size() {
		return members.size();
	}
	
	public Student getMember(int member) {
		return members.get(member);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isFull() {
		return this.members.size() >= this.maximalNumberOfStudents;
	}

	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(this);
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("==== " + this.name + " ====").append('\n');
		buf.append("Course members:\n");
		for (Student s : this.members) {
			buf.append("- ");
			buf.append(s).append('\n');
		};
		return buf.toString();
	}

	public static void main(String[] args) throws Exception {		
		Course java2 = new Course("Java 2", 100);
		
		java2.addMember(StudentFactory.createNewStudent());
		java2.addMember(StudentFactory.createNewStudent());
		java2.addMember(StudentFactory.createNewStudent());
		java2.addMember(StudentFactory.createNewStudent());
		java2.addMember(StudentFactory.createNewStudent());

		// TODO: implement different priorities of entering into the course using Queues
		
		System.out.println(java2);
		
		// TODO: Demonstrate a set of students using hashCode and equals
	}

}
