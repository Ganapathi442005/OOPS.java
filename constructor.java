import java.util.*;
class parameterConstructor{
	int roll;
	String name;
	// PARAMETER CONSTRUCTOR
	public parameterConstructor(int number,String name)
	{
		this.roll = number;
		this.name = name;
	}
	// COPY CONSTRUCTOR
	public parameterConstructor(parameterConstructor obj)
	{
		this.roll = obj.roll;
		this.name = obj.name;
	}
	// DEFAULT CONSTRUCTOR
	public parameterConstructor()
	{
		this.roll = 0;
		this.name = "unknown";
	}
	public void display(){
		System.out.println("The name is "+this.name+" and the roll number is "+this.roll);
	}
}
public class Main{
	public static void main(String[] args){
		parameterConstructor first = new parameterConstructor(7,"Akash");
		first.display();
		parameterConstructor second = new parameterConstructor(52,"Ganapathi");
		second.display();
		parameterConstructor firstcopy = new parameterConstructor(first);
		firstcopy.display();
		parameterConstructor third = new parameterConstructor();
		third.display();
	}
}
