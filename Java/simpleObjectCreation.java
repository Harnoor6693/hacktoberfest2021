package java_2;

public class java_2 {
	
	private int empid;
	private String name;
	private double salary;
	
	public void initEmployee() {
		empid=1001;
		name="test";
		salary=10000;
	}
	
	public void printEmployee() {
		System.out.println(empid + " " + name + " " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_2 obj1 = new java_2();
		obj1.initEmployee();
		obj1.printEmployee();
	}

}
