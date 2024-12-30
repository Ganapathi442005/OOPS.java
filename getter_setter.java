public class employee{
	private int id;
	private String name;
	private double salary;
	public employee(int id,String name,double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name!=null && !name.isEmpty())
		{
			this.name = name;
		}
		else
		{
			System.out.println("Enter the valid name");
		}
	}
	public double getSalery(){
		return this.salary;
	}
	public void setSalery(double salary){
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{	
			System.out.println("Enter the valid Salery");
		}
	}
	/*public void display(){
		System.out.println("The name is "+this.name+" and id is "+this.id+" and salary is : "+this.salary);
	}*/


}
//DISPLAYING GETTER_SETTER
class display{
	public static void main(String[] args)
    {
		employee e1 = new employee(120,"Akash",12000.5);
		
		System.out.println("The name is : "+e1.getName());
		System.out.println("The Id is : "+e1.getId());
		System.out.println("The Salery is : "+e1.getSalery());
	}	
}
