public class Demo{

void display()
     {
     System.out.println("Display");
    }

public int add(int a,int b)
   {
      System.out.println("a and b is "+(a+b));
   return(a+b);
   }
public static void main(String[] args)
  {
   Demo obj=new Demo();
   obj.display();
  int result= obj.add(10,20);
  }
}

