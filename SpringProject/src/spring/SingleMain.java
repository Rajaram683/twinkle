package spring;

public class SingleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonDemo st=SingletonDemo.getObject("Legato");
		SingletonDemo st1=SingletonDemo.getObject("IIHT");
		st.display();
		st1.display();
		System.out.println(st);
		System.out.println(st1);
		System.out.println(SingletonDemo.getCount());

	}

}
