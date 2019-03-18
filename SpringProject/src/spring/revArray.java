package spring;

public class revArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
int i;
int temp;
for(i=0; i<arr.length/2;i++)
{
	temp=arr[i];
	arr[i]=arr[arr.length-1-i];
	arr[arr.length-1-i]=temp;
	}
for(i=0; i<=arr.length-1;i++  )
{
System.out.print(arr[i]);


}
	}
}
