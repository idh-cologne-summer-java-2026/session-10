package idh.java;

public class Student {
	String name;
	int matrikelNummer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int mNum) {
		super();
		this.name = name;
		this.matrikelNummer = mNum;
	}

	@Override
	public String toString() {
		return name + " (" + this.matrikelNummer + ")";
	}

	public static void main(String[] args) {
	}
}
