public class Methodoverloading{

public static void Customer(int phonenumber){
                                        System.out.println("phonenumber is"+phonenumber);
                                        
                           }
                           
public static void Customer(short  phonenumber,int aadharnumber){
                                          System.out.println(+phonenumber+"\n"+aadharnumber);

                                 }
public static int Customer(int a,int b){
                  int c=a+b;
                                    System.out.println(c);
                  return c;
                                    }
}

