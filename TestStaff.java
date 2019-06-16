package staff.test;

import example.StaffMember;
import example.Lecturer;

public class TestStaff {
	public static void main(String[] args) {
		// create new StaffMember Project: 
		// test for toString() Method
		StaffMember member1 = new StaffMember("John", 4000, "2013-08-03", "2018-10-02");
		System.out.println(member1);
		System.out.println("----------------------   ------------------------\n");
		
		// test for ShowMethods()
		StaffMember member2 = new StaffMember("Kevin", 5000, "2016-07-03", "2019-03-19");
		member2.showStaffDetails();
		System.out.println("----------------------   ------------------------\n");
		
		Lecturer lecturerA = new Lecturer("Alice", 2500,"2016-01-03", "2019-03-01", "Arts","C");
		/*lecturerA.setName("John");
		lecturerA.setSalary(3600);
		lecturerA.setHireDay("2010-10-2");
		lecturerA.setEndDay("2014-12-8");
		lecturerA.setSchool("CSE");
		lecturerA.setStatus("A");*/
		System.out.println(lecturerA);
	}
}
/*public class Test_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A(4, 5);
		A a2 = new A(4, 5);
		
		//if( a1 == a2 ) {   // compares references, which are different
		
		if(a1.equals(a2)) {
			System.out.println(" a1 == a2 is True");
		}
		else {
			System.out.println(" a1 == a2 is False");			
		}
		
		
	}*/


// https://www.w3schools.com/java/ref_string_equals.asp
//	http://www.runoob.com/java/java-string-tostring.html
