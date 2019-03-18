package spring;

public class SingletonDemo {
	private static   String name=null;
	private static int count=0;
	

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		SingletonDemo.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private SingletonDemo(String name)
	{
		this.name=name;
		count++;
	}
	
	public static SingletonDemo getObject(String name)
	{if ( name== null) 
	{
	count++;
	}
		return new SingletonDemo(name);
	}
public void display()
{
	System.out.println(name);
	
}
}
