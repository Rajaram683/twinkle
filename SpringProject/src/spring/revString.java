package spring;
import java.util.Scanner;

public class revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
String n=sc.next();
String s1="";
for(int i=n.length()-1;i>=0;i--)
{
	s1=s1+n.charAt(i);
}n=s1;
System.out.println(n);
	}

}
 