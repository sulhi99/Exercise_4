import java.util.Scanner;
class TestStaff 
{
	static Scanner console = new Scanner(System.in);
   String name,id;
   int workingDay;
   
   public static void main(String args[])
   {
     
    System.out.println("*****************************************");    
    System.out.println("****************STAFF INFO***************");    
    System.out.println("*****************************************"); 
    System.out.print("Name         : ");
    String name = console.nextLine();
    System.out.print("Staff ID     : ");
    String id = console.nextLine();
    System.out.print("Working Day  : ");
    int workingDay = console.nextInt();
    
    Staff details = new Staff();
    details.setStaffInfo(name,id,workingDay);
    details.calculateSalary();
    System.out.println();
    System.out.println("*****************************************"); 
    System.out.println("****************STAFF INFO***************");
    System.out.println("*****************************************"); 
    System.out.printf("Staff Name   : %s%n",details.getName());
    System.out.printf("Staff ID     : %s%n",details.getStaffID());
    System.out.printf("Staff Salary : RM %.2f%n",details.getSalary());
   }
}
 
 class Staff
   {
	
     private String name, staffID;
	  private double salary;
	  private int workingDay;
	  public void setStaffInfo(String nm, String id, int wDay)
	 
    {
   	name=nm;
      staffID=id;
      workingDay=wDay;
      
	 } 
   
   public void calculateSalary()
     {
		salary = workingDay * 35.0;
     }
	
   public double getSalary()
     {
		return salary;
     }
   
	public String getName()
     {
		return name;
	  }
   
	public String getStaffID()
     {
		return staffID;
	  }
   
}//end class

 
    

