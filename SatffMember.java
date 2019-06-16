package example;

public class StaffMember {

	// Attributes (State) /* staff member’s name, salary, hire date, and end date*/
	// write data in product object we have in this method
	private String name;
	private int salary;
	private String hireDay;
	private String endDay;
	
	//setter
	// To read data from product object
	public StaffMember(String name, int salary, String hireDay, String endDay) {
		this.name = name;
		this.salary = salary;
		this.hireDay = hireDay;
		this.endDay = endDay;
	}
	
	public void setName(String name) {
		this.name = name;
		// LHS belongs to the Object and RHS-->method
	}
	String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
		// LHS belongs to the Object and RHS-->method
	}
	int getSalary() {
		return salary;
	}
	
	public void setHireDay(String hireDay) {
		this.hireDay = hireDay;
		// LHS belongs to the Object and RHS-->method
	}
	String getHireDay() {
		return hireDay;
	}
	 
	public void setEndDay(String endDay) {
		this.endDay = endDay;
		// LHS belongs to the Object and RHS-->method
	}
	String getEndDay() {
		return endDay;
	}
	// use show method to read data from class object
	public void showStaffDetails() {
		System.out.println("Staff name: " +name);
		System.out.println("Staff salary: " +salary);
		System.out.println("Staff hire period: " +hireDay+" to "+endDay);
	}

	@Override
	// use toString method instead of using show, to output data as a string
    public String toString() {
        return ("Staff_Name: " + name + ",  Salary: " + salary + ",  Staff hire period: " +hireDay+" to "+endDay);
    }
	
	@Override
	// compares this string to the specified object
	// *********** reference from Week01 Lecture notes *******
	public boolean equals(Object Staff) {
		
		if(Staff == null) {
			return false;
		}
		
		if( Staff instanceof StaffMember) {
			StaffMember s1 = (StaffMember) Staff;
			
			if (s1.name == this.name && s1.salary == this.salary && 
				s1.hireDay == this.hireDay && s1.endDay == this.endDay) {
				return true;
			} else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}
