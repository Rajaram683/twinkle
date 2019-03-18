package spring;

public class Hello {
	private String message;
	static int count=0;
	   public void setMessage(String message){
	      this.message  = message;
	   } 
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	      System.out.println("hey how are you");
	      
	   }
	   private String name;
	   public String getName() {
		   System.out.println("Your Name : " + name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		System.out.println("Your Address: " +address);
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	 Hello()
	 {
		 count++;
	 }
	 Hello(String name,String address)
	 {
		 this.address=address;
	 this.name=name;
		 count++;
		 
	 }

}
