package patterns.prototype;

import java.util.List;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employees empList = new Employees();
		empList.loadData();

		// Use the clone method to get the Employee object
		Employees empListNew1 = (Employees) empList.clone();
		Employees empListNew2 = (Employees) empList.clone();

		List<String> list1 = empListNew1.getEmpList();
		list1.add("John");

		List<String> list2 = empListNew2.getEmpList();
		list2.remove("Pankaj");

		System.out.println("EmpList: " + empList.getEmpList());
		System.out.println("EmpList2: " + list1);
		System.out.println("EmpList3: " + list2);
	}
}
