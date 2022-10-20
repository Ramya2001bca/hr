public class Mobile extends Telephone 
 {
int price=1500;
String name="Mobile";

public void sms()
   {
   System.out.println("Message Facility");
 }
 
public static void main(String[] args)
   {

    Mobile samsung=new Mobile();
    samsung.call();
    samsung.receive_call();
    samsung.sms();
     System.out.println(samsung.price);
     System.out.println(samsung.name);
    
  Telephone bsnl=new Telephone();
  System.out.println(bsnl.price);
     System.out.println(bsnl.name);
    
   }
}
