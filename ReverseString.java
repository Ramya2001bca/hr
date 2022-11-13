public class ReverseString
{
public static void main(String[] args)
{
String name="Ramya";
int no=name.length()-1;
int count=0;

while(no>=0){
    System.out.print(name.charAt(no));
    no=no-1;
    count=count+1;
  }
System.out.println("\n"+count);
}
}
