public class CusionChair extends WoodenChair{
//@Override
String colour="Black";
@Override
  void seating(){
System.out.println("sponge");
//return seating;
}

public static void main(String[] args){

CusionChair a=new CusionChair();
System.out.println(a.colour);
a.seating();
}
}
