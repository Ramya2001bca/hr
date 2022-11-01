public class Calculator{
int x=0;
int y=1;

public void add(){
           System.out.println(x);
           System.out.println(x+y);

       }
public void sub(){
      //this.x;
      //this.y;
           System.out.println(this.x);
           System.out.println(this.x-this.y);
    }

public static void main(String[] args)
{
Calculator a=new Calculator();
a.x=2;
a.y=2;
a.add();
Calculator b=new Calculator();
b.sub();
}
}                                                                       
