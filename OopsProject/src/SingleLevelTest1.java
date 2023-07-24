import java.time.LocalDate;

public class SingleLevelTest1 {
	public static void main(String[] args) {
		
		PanCard pancard1 = new PanCard();
		pancard1.setDateOfBirth(LocalDate.of(2001, 3, 13));
		pancard1.setNameOnPan("Rohan");
		pancard1.setPanNumber("ABCRF2491N");
		
		PanCard pancard2 = new PanCard();
		pancard2.setDateOfBirth(LocalDate.of(2002, 4, 14));
		pancard2.setNameOnPan("Shyam");
		pancard2.setPanNumber("ABCDE3589H");
		
		PanCard pancard3 = new PanCard();
		pancard3.setDateOfBirth(LocalDate.of(2001, 3, 13));
		pancard3.setNameOnPan("Ram");
		pancard3.setPanNumber("DERYI3491L");
		
		Person personObj = new Person('M',"Rohan",22,pancard1);
		personObj.showPerson();
		System.out.println("-----------------");
//		
		
//		Student studentObj = new Student('M',"Jack",24,   123,"BharatiVidyapeeth","MechEng",899);
//		studentObj.showStudent();
		
		System.out.println("-----------------");
		Employee empObj = new Employee('F',"Jane",22,   323,"MIT","ITEng",999, 1212,"Google Inc","Brain Analyst",9999);
		empObj.showEmployee();
	}
}

class PanCard{
	private String nameOnPan;
	private LocalDate dateOfBirth;
	private String panNumber;
	
	public String getNameOnPan() {
		return nameOnPan;
	}
	public void setNameOnPan(String nameOnPan) {
		this.nameOnPan = nameOnPan;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	void printPanCard() {
		System.out.println("-------PanCard Details-------");
		System.out.println("Name On Pan : "+ nameOnPan);
		System.out.println("Date Of Birth : "+ dateOfBirth);
		System.out.println("Pan Number : "+ panNumber);
	}
}

class Person {
	private char gender;
	private String name;
	private int age;
	private PanCard panCard;
//	Person() {
//		System.out.println("Person() ctor....");
//	}
	
//	Person(int age) {
//		this('F',"NONAME",age);
//	}
	
	Person(char gender, String name, int age, PanCard panref){
		this(gender,name,age);
		this.panCard=panref;
	}
	
	Person(char gender, String name, int age) {
		System.out.println("START=> Person(char,String,int) ctor....");		
		
		if(gender=='M' || gender=='F') {
			this.gender = gender;
		}
		else {
			//System.out.println("Invalid Gender...");
			//throw new RuntimeException("Invalid gender.....");
			RuntimeException runtimeGenderEx = new RuntimeException("Invalid gender : "+gender);
			throw runtimeGenderEx;
		}
		
		if(Validator.checkString(name)) {
			this.name = name;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid name : "+name);
			throw runtimeNameEx;
		}
		
		if(age >=1 && age <=120) {
			this.age = age;
		}
		else {
			RuntimeException runtimeAgeEx = new RuntimeException("Invalid age : "+age);
			throw runtimeAgeEx;	
		}
		System.out.println("FINISH=> Person(char,String,int) ctor....");
		
		

	}
	void showPerson() {
		System.out.println("---- PERSONAL ----");
		System.out.println("GENDER : "+gender);
		System.out.println("NAME   : "+name);
		System.out.println("AGE    : "+age);
		if(panCard!=null) {
			panCard.printPanCard();
		}
		else {
			System.out.println("Pan Card not set");
		}
	}
 }
class Student extends Person {
	private int rollNumber;
	private String collegeName;
	private String stream;
	private float totalMarks;
		
	Student(char gender, String name, int age, int rollNumber,String collegeName, String stream, float totalMarks) {
		super(gender,name,age); 
		System.out.println("Student() ctor...");
		
		if(Validator.checkNumber(rollNumber, 1, 500)) {
			this.rollNumber = rollNumber;			
		}
		else {
			RuntimeException runtimeRollNumberEx = new RuntimeException("Invalid Roll Number : "+rollNumber);
			throw runtimeRollNumberEx;
		}
		
		if(Validator.checkString(collegeName)) {
			this.collegeName = collegeName;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid collegeName : "+collegeName);
			throw runtimeNameEx;
		}
		
		if(Validator.checkString(stream)) {
			this.stream = stream;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid stream : "+stream);
			throw runtimeNameEx;
		}
		

		if(Validator.checkNumber(totalMarks, 1, 1000)) {
			this.totalMarks = totalMarks;			
		}
		else {
			RuntimeException runtimeMarksEx = new RuntimeException("Invalid Marks : "+totalMarks);
			throw runtimeMarksEx;
		}
		

		this.totalMarks = totalMarks;
	}
	
	void showStudent() {
		super.showPerson(); //super. to invoke super class member/data/function
		System.out.println("---- STUDENT ----");
		System.out.println("ROLLNO : "+rollNumber);
		System.out.println("COLLGE : "+collegeName);
		System.out.println("STREAM : "+stream);
		System.out.println("MARKS  : "+totalMarks);
	}
}
class Employee extends Student {
	private int empno;
	private String companyName;
	private String designation;
	float salary;
	
	
	Employee(char gender, String name, int age, int rollNumber,String collegeName, String stream, float totalMarks,int empno, String companyName, String designation, float salary) {
		super( gender,  name,  age,  rollNumber, collegeName,  stream,  totalMarks);
		System.out.println("Employee() ctor...");
		
		if(Validator.checkNumber(empno, 100, 2000)) {
			this.empno = empno;			
		}
		else {
			RuntimeException runtimeEmpnoEx = new RuntimeException("Invalid empno : "+empno);
			throw runtimeEmpnoEx;
		}
		
		if(Validator.checkStringWithSpace(companyName)) {
			this.companyName = companyName;
		}
		else {
			RuntimeException runtimeCompanyNameEx = new RuntimeException("Invalid companyName : "+companyName);
			throw runtimeCompanyNameEx;
		}
		
		if(Validator.checkStringWithSpace(designation)) {
			this.designation = designation;
		}
		else {
			RuntimeException runtimeDesignationEx = new RuntimeException("Invalid designation : "+designation);
			throw runtimeDesignationEx;
		}
		

		if(Validator.checkNumber(salary, 5000, 20000)) {
			this.salary = salary;			
		}
		else {
			RuntimeException runtimeSalaryEx = new RuntimeException("Invalid salary : "+salary);
			throw runtimeSalaryEx;
		}
	}
	
	void showEmployee() {
		super.showStudent(); //super. to invoke super class member/data/function
		System.out.println("---- EMPLOYEE ----");
		System.out.println("EMPNO  : "+empno);
		System.out.println("COMPANY: "+companyName);
		System.out.println("DESG   : "+designation);
		System.out.println("SALARY : "+salary);
	}
}