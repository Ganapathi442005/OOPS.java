import java.util.*;
 class person
 {
    private int id;
    private String name;
    private int age;
    private String address;
    public static String clgname;
    public person(int id,String name,int age,String address)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public person()
    {
        this.id=0;
        this.name="";
        this.age=0;
        this.address="";
    }
    public int getId(){
		return this.id;
	}
	public void setId(int id){
		if(id>0)
		{
			this.id = id;
		}
		else
		{
			System.out.println("Enter the valid id");
		}
	}
    public String getname(){
		return this.name;
	}
	public void setname(String name){
		if(name!=null)
		{
			this.name = name;
		}
		else
		{
			System.out.println("Enter the valid name");
		}
	}
    public int getage(){
		return this.age;
	}
	public void setage(int age){
		if(age>0)
		{
			this.age = age;
		}
		else
		{
			System.out.println("Enter the valid age");
		}
	}
    public String getaddress(){
		return this.address;
	}
	public void setaddress(String address){
		if(address!=null)
		{
			this.address= address;
		}
		else
		{
			System.out.println("Enter the valid address");
		}
	}

    public void display(){
        System.out.println("the id:" +id);
        System.out.println("the name:"+name);
        System.out.println("the age:"+age);
        System.out.println("the address:"+address);
    }
}


 class student extends person
 {
    private String studentid;
    private String grade;
    public student(int id,String name,int age,String address,String studentid,String grade)
    {
        super(id,name,age,address);
        this.studentid=studentid;
        this.grade=grade;
    }
    public student(){
        this.studentid="";
        this.grade="";
    }
  public String getgrade(){
    return this.grade;
  }
  public void setgrade(String grade)
  {
    if(grade!=null)
		{
			this.grade= grade;
		}
		else
		{
			System.out.println("Enter the valid grade");
		}
  }
  public String getstudentid(){
    return this.studentid;
  }
  public void setstudentid(String studentid)
  {
    if(studentid!=null)
		{
			this.studentid= studentid;
		}
		else
		{
			System.out.println("Enter the valid studentid");
		}
  }
  @Override
  public void display()
  {
       super.display();
       System.out.println("the studentid:"+studentid);
       System.out.println("the grade:"+grade);
  }

}

class teacher extends person
{
    private String subject;
    private double salary;
    public teacher(int id,String name,int age,String address,String subject,double salary)
    {
        super(id,name,age,address);
        this.subject=subject;
        this.salary=salary;
    }
    public teacher(){
        
        this.subject="";
        this.salary=0;
    }
  public String getsubject(){
    return this.subject;
  }
  public void setsubject(String subject)
  {
    if(subject!=null)
		{
			this.subject= subject;
		}
		else
		{
			System.out.println("Enter the valid subject");
		}
  }
  public double salary(){
    return this.salary;
  }
  public void setsalary(double salary)
  {
    if(salary>0)
		{
			this.salary= salary;
		}
		else
		{
			System.out.println("Enter the valid salary");
		}
  }
  @Override
  public void display()
  {
       super.display();
       System.out.println("the subject:"+subject);
       System.out.println("the salary:"+salary);
  }
}


class adminstaff extends person
{
    private String department;
    private String role;
    public adminstaff(int id,String name,int age,String address,String department,String role){
        super(id,name,age,address);
        this.department=department;
        this.role=role;
    }
    @Override
    public void display()
    {
         super.display();
         System.out.println("the department:"+department);
         System.out.println("the role:"+role);
    }
    
}

class mainfunction
{
   public static void main(String[] args) 
    {
    ArrayList<person> person1=new ArrayList<>();
       person1.add(new person(7,"deepan",67,"dindigul"));
       person1.add(new teacher(33,"akash",19,"namakkal","maths",100000.67));
       person1.add(new adminstaff(1,"nithesh",21,"chennai","ece","hod"));
       for(person person5:person1)
       {
        System.out.println("=================================================");
        person5.display();
       }
       person p1=new person();
       p1.setId(15);
       p1.setname("manoj");
       p1.setage(27);
       p1.setaddress("mumbai");
       System.out.println("=================================================");
       p1.display();
    }
}
