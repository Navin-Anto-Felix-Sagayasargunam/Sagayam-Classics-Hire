import java.io.*;
import java.util.Date;
import java.util.Scanner;
class DateTime 
{  private static long advance; // keeps tracks of any time advance   
private static long time;  
public DateTime()  // constructor   
{   time = System.currentTimeMillis() + advance;    }   
public static long getTime() {return time; } 

// advances date/time by specified days, hours and mins for testing purpose   
public static void setAdvance(int days, int hours, int mins)  
{   advance = ((days * 24L + hours) * 60L) *60000L;    }  
public String toString()     {  
	long l = getTime();      
	Date gct =  new Date(l);              
	return gct.toString();    }      
public static String getCurrentTime()  // returns current date/time   
{       Date d = new Date(System.currentTimeMillis() + advance);       
return d.toString();    }    // returns difference in days       
public static int diffDays(DateTime d2, DateTime d1)   
{       return (int) ( 1 + ( DateTime.getTime() - DateTime.getTime() )/(24L*60*60*1000));    }
public static String dateString() {
	// TODO Auto-generated method stub
	return null;
}
public static int daysSince(long hiredTime) {
	// TODO Auto-generated method stub
	return 0;
}  

} 
class ClassicCar
{
   private String ID;
   private double dailyRate;
   private char status;
   private String hirer;
   private long hiredTime;
   private int odoReading;
   private String model;
   private String Name;
   private String Position;
   private String Company;
   private int dailymileage;
   private int servicelength;
   private int lastservice;
   private double Rate;
   public ClassicCar(String ID, String model, double rate, int miles,int dailymile,int servlength,int lastserv)
   {
      this.ID = ID;
      this.model = model;
      dailyRate = rate;
      status = 'A';
      odoReading = miles;
      dailymileage=dailymile;
      servicelength=servlength;
      lastservice=lastserv;
      
   }
   public ClassicCar(String Name,String Designation,String organization,double rate)
   {
      this.Name = Name;
      this.Position=Designation;
      this.Company=organization;
      Rate = rate;
     
   }
   public String getName()
   {
	   return Name;
   }
   public String getPosition()
   {
	   return Position;
   }
   public String getCompany()
   {
	   return Company;
   }
   public double getRate()
   {
	   return Rate;
   }
   public String getID()
   {
      return ID;
   }

   public int getOdoReading()
   {
      return odoReading;
   }

   public char getStatus()
   {
      return status;
   }

   public boolean hire(String hirer)
   {
      if ( status == 'A')
      {
         this.hirer = hirer;
         status = 'H';
         hiredTime = DateTime.getTime();
         return true;
      }
      return false;
   }

   public void print()
   {
       System.out.print("ID = " + ID);
       System.out.print("\tModel = " + model);
       System.out.print("\tstatus = " + status);
       System.out.print("\tOdometer Reading = " + odoReading); 
       System.out.print("\tDaily Rate = " + dailyRate); 
       System.out.print("\tDaily Mileage = " + dailymileage); 
       System.out.print("\tService Length = " + servicelength); 
       System.out.print("\tLast Service = " + lastservice); 
       if ( status == 'H')
          System.out.print("\t The Classic car "+ model +" is hired by " + hirer);
       System.out.println();
   }
   public double retn(int miles)
   {
      if ( status != 'H')
         return -1.0;
      else {
         status = 'A';
         int daysElapsed = DateTime.daysSince(hiredTime);
         if ( daysElapsed < 1) 
             daysElapsed = 1;
      
         double amt = (daysElapsed * dailyRate) + (miles - odoReading);
         odoReading = miles;
         return amt;
      }      
   }   
}  
public class ManageHiring {

	private static Scanner con;

	public static void main(String[] args)throws IOException {
		con = new Scanner(System.in);
	      ClassicCar c[] = new ClassicCar[10]; 
	      c[0] = new ClassicCar("CIA147","CHEVROLET IMPALA",13.0, 104000,0,0,0);
	      c[1] = new ClassicCar("CBA270","CHEVROLET BEL AIR",24.0,105780,100,10000,5000);
	      c[2] = new ClassicCar("FTB345","FORD THUNDERBIRD",33.0,45000,0,0,0);
	      c[3] = new ClassicCar("MGT457","MASERATI 3500 GTI",45.0,23000,0,0,0);
	      c[4] = new ClassicCar("CCS587","CHEVROLET CAMARO SS",57.0,34000,0,0,0);
	      c[5] = new ClassicCar("FMB641","FORD'S  MODEL -  B",67.0,45000,120,12000,20000);
	      c[6] = new ClassicCar("WSC789","WILLY'S 77 COUPE",75.0,57000,200,10000,17500);
	      c[7] = new ClassicCar("WAC845","WILLY'S AMERICAR COUPE",84.0,30000,100,12000,5000);
	      c[8] = new ClassicCar("CSD923","CHEVROLET SP DELUXE",90.0,20000,120,10000,20000);
	      c[9] = new ClassicCar("PRR000","PLYMOUTH ROADRUNNER",95.0,10000,0,0,0);
	      
	      
	      char resp; 
	      char feed;
	      ClassicCar s[]= new ClassicCar[7];
	      s[0] = new ClassicCar("Antony","Senior Analyst","Commonwealth Bank",0.15);
	      s[1] = new ClassicCar("Felix","Data Scientist","Zoho Corporation",0.10);
	      s[2] = new ClassicCar("Navin","Senior Lead Programmer","Ubisoft Entertainment",0.10);
	      s[3] = new ClassicCar("Josh","Chief Technology Officer","Google LLC",0.20);
	      s[4] = new ClassicCar("David","Senior Analyst","NAB Bank",0.15);
	      s[5] = new ClassicCar("Robert","Chief Financial Officer","Australian National Bank",0.20);
	      s[6] = new ClassicCar("Charles","Senior Data Scientist","Westpac Bank",0.15);
	      double discount=0;
	      double amount;
	      
	      do {
      
              System.out.println("SAGAYAM CLASSICS HIRE");
	    	  System.out.print("Would you like to know about cars available for hire ?  Y/N : ");
		      feed = con.nextLine().charAt(0);
	  if ( feed != 'n' && feed != 'N') {
		      System.out.println("***** AVAILABLE CARS FOR HIRE IN SAGAYAM'S CLASSICS GARAGE ***** as at " + DateTime.getCurrentTime());
		      for (int i=0; i<10; i++)
		         c[i].print();
	  }
		      else {
		    	  System.out.println("Request accepted");
		      }
		      
      
	         System.out.print("Enter Car ID : ");
	         String carID = con.nextLine();
	         
	        	
	         
	         boolean found = false;
	         for ( int i=0; i<10; i++)
	         {
	            if (c[i].getID().compareTo(carID)==0)  
	            {
	               found = true;
	               if (c[i].getID().compareTo(carID)==0&&c[i].getID()=="CBA270"||c[i].getID().compareTo(carID)==0&&c[i].getID()=="FMB641"||c[i].getID().compareTo(carID)==0&&c[i].getID()=="CSD923"||c[i].getID().compareTo(carID)==0&&c[i].getID()=="WSC789"||c[i].getID().compareTo(carID)==0&&c[i].getID()=="WAC845") 
		        	 {
		        		found = true; 
		        		 System.out.println("The Classic Car you've chosen is a Hot Rod - A Premium vehicle");
		        		 }
	               System.out.print("Enter the request (Hire/Service Complete)  H/S : ");
	               char carStatus = c[i].getStatus(); 
	               char op = con.nextLine().charAt(0);
	               
	               if ( op =='H' && carStatus != 'A'  || op == 'S' && carStatus != 'H' )
	                   System.out.println("This request cannot be performed. The Status of Classic car now is "+ carStatus);
	               else if ( op == 'H')
	               {
                        
	                   System.out.print("Enter the name of hirer of Classic Car ID  " + c[i].getID() + " : ");
	                   String hirer = con.nextLine();
	                  
	                   
	                   if ( c[i].hire(hirer)==true) 
	                   {
	                	   found=true;
	                	   for(int j=0;j<7;j++) {
	                   
	                   if(s[j].getName().compareTo(hirer)==0) 
	                   {
	                	   found=true;
	                   
	                	   System.out.println("Mr."+s[j].getName()+" works as a "+s[j].getPosition()+" at "+s[j].getCompany()+".He is a Corporate Customer and he gets a preset discount rate at "+s[j].getRate());
	                	    discount=s[j].getRate();
	                   }}
	                	  
	                      System.out.println("Mr/Ms."+hirer + " succesfully hired the Classic Car with ID " + c[i].getID() 
	                      + ". Initial odometer reading at the time of hiring is "+c[i].getOdoReading());} 
	                	  
	                   else
	                      System.out.println("Attempt to hire the Classic Car has failed.");                   
	               }
	               else if ( op == 'S')
	               { 
	                  System.out.print("Enter Current Odometer Reading at the time of return for the Classic Car ID " + carID + " : ");
	                  int miles = con.nextInt(); con.nextLine();
	                  double amt = c[i].retn(miles);
	                  if ( amt >= 0.0)
	                  {	 
	                	  if(discount!=0)
	                      {
	                	  amount=amt*discount;
	                     System.out.println("The Classic Car with ID "+ c[i].getID() +" has been returned from service. Charges for the vehicle are  $" + amount+" AUD");}
	                     else
	                     {
	                    	 amount=amt*0.10;
		                     System.out.println("The Classic Car with ID "+ c[i].getID() +" has been returned from service. Charges for the vehicle are  $" + amount+" AUD");}
	                  }
	                  else
	                     System.out.println("Car return attempt has failed ");
	               }
	               else  
	                   System.out.println("UNAUTHORIZED REQUEST ");
	            }             
	         }  
	         if ( found == false )
	            System.out.println("No classic car is available at garage with this ID : " + carID);
	         
	         
	         System.out.print("Any other service requests you have  Y/N : ");
	         resp = con.nextLine().charAt(0);
	      } while ( resp != 'n' && resp != 'N');
	      System.out.println("***** DETAILS OF CARS IN SAGAYAM'S CLASSICS GARAGE ***** as at " + DateTime.getCurrentTime());
	      for (int i=0; i<10; i++)
	         c[i].print();
	      
	       FileReader fr = new FileReader("C:\\Users\\NAVIN\\Desktop\\ManageHiring.java");
	      BufferedReader br= new BufferedReader(fr);
	      FileWriter fo=new FileWriter("C:\\Users\\NAVIN\\Desktop\\file1.text");
	      String e;
	      while((e=br.readLine())!=null){
	    	  
	    	  fo.write(e);
	    	  
	      }
	      fr.close();
	      fo.close();
	      
	      
	      

	}

}
