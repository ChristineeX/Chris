package example;

//Lecturer is a sub-class of StaffMember, it inherited:
// name, salary, hire day, end day
public class Lecturer extends StaffMember {
	// Additional attributes for lecturer
	private String school;
	private String academic_stat;
	
	// Constructor for Lecturer Objects
	public Lecturer(String name, int salary, String hireDay, String endDay, String school,String academic_stat) {
		super(name, salary, hireDay, endDay);
		this.school = school;
		this.academic_stat = academic_stat;
	}
	
	// setter and getter for additional attributes:
	public void setSchool(String school) {
		this.school = school;
	}
	String getSchool() {
		return school;
	}
	
	public void setStatus(String academic_stat) {
		this.academic_stat = academic_stat;
		// LHS belongs to the Object and RHS-->method
	}
	String getSatus() {
		return academic_stat;
	}
	
	// get and set details of lecturer from parent class:
		public String getName() {
	        return super.getName();
	    }
		public void setName(String name) {
	        super.setName(name);
	    }
		
		
		public int getSalary() {
	        return super.getSalary();
	    }
		public void setSalary(int salary) {
			super.setSalary(salary);
		}
		
		public String getHireDay() {
	        return super.getHireDay();
	    }
		public void setHireDay(String hireDay) {
	        super.setHireDay(hireDay);
	    }
		
		public String getEndDay() {
	        return super.getEndDay();
	    }
		public void setEndDay(String endDay) {
	        super.setEndDay(endDay);
	    }
		
	public String toString() {
        return (super.toString() + ",  Belongs to shool of: "+school+",  Academic_status: "+ academic_stat);
    }

	@Override
	public boolean equals(Object Lec) {
		
		if(Lec == null) {
			return false;
		}
		
		if( Lec instanceof Lecturer) {
			Lecturer lec1 = (Lecturer) Lec;
			
			if (super.equals(Lec) && lec1.school == this.school && lec1.academic_stat == this.academic_stat) {
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
