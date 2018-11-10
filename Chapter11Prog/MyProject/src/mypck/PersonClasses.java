package mypck;

import java.sql.Date;

public class PersonClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	Person person = new Person("person");
	        Student student = new Student("student");
	        Employee employee = new Employee("employee");
	        Faculty faculty = new Faculty("faculty");
	        Staff staff = new Staff("staff");

	        System.out.println(person.toString());
	        System.out.println(student.toString());
	        System.out.println(employee.toString());
	        System.out.println(faculty.toString());
	        System.out.println(staff.toString());
	}
}

class Person
{
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
	public Person()
	{
		
	}
	public Person(String name)
	{
		this.name = name;
	}
	public Person(String pname,String paddress,String pphoneNumber,String pemail)
	{
		this.name = pname;
		this.address = paddress;
		this.phoneNumber = pphoneNumber;
		this.email = pemail;
		
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getPhone()
	{
		return phoneNumber;
	}
	public void setPhone(String phone)
	{
		this.phoneNumber = phone;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail()
	{
		this.email = email;
	}
	public String toString()
	{
		return "Name: " + getName() + "Class : " + this.getClass().getName();
	}
}
class Student extends Person
{
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	
	protected String  status;
	
	public Student(String name)
	{
		super(name);
	}
	
	public Student(String name,String status)
	{
		super(name);
		this.status = status;
	}
	public String toString()
	{
		return "Name: " + getName() + "Class : " + this.getClass().getName();
	}
}

class Employee extends Person
{
	protected String office;
	protected double salary;
	protected Date dateHired;
	
	public Employee(String name)
	{
		//this(name,0,"none" ,new Date());
	}
	public Employee (String name,double salary,String office,Date dateHired)
	{
		super(name);
		this.salary = salary;
		this.office= office;
		this.dateHired = dateHired;
	}
	
	public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
	
	public String toString()
	{
		return "Name: " + getName() + "Class : " + this.getClass().getName();
	}
}
class Faculty extends Employee
{
	
	 public static String LECTURER = "Lecturer";
	    public static String ASSISTANT_PROFESSOR = "Assistant Professor";
	    public static String ASSOCIATE_PROFESSOR = "Associate Professor";
	    public static String PROFESSOR = "Professor";

	    protected String officeHours;
	    protected String rank;

	    public Faculty(String name) {
	        this(name, "9-5PM", "Employee");
	    }

	    public Faculty(String name, String officeHours, String rank) {
	        super(name);
	        this.officeHours = officeHours;
	        this.rank = rank;
	    }

	    public String getOfficeHours() {
	        return officeHours;
	    }

	    public void setOfficeHours(String officeHours) {
	        this.officeHours = officeHours;
	    }

	    public String getRank() {
	        return rank;
	    }

	    public void setRank(String rank) {
	        this.rank = rank;
	    }
	
	public String toString()
	{
		return "Name: " + getName() + "Class : " + this.getClass().getName();
	}
}
class Staff extends Employee
{
    protected String title;

    public Staff(String name) {
        this(name, "none");

    }

    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public String toString()
	{
		return "Name: " + getName() + "Class : " + this.getClass().getName();
	}
}



