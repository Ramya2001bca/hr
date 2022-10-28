public class TPayilagam extends Payilagam{ 
@Override
void feesStructure()
    {
       System.out.println(1);
  }
  
public TPayilagam(int a)
  {
 // int a=19;
   super();
      System.out.println(a);
  }

public static void main(String[] args){
TPayilagam tp=new TPayilagam(18);
tp.feesStructure();
System.out.println(tp.COURSE);
}
}


