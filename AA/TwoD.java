public class TwoD extends ThreeD{
String name="ramya";
@Override
public void thirlMovie(){
super.thirlMovie();
//this.thirlMovie();
System.out.println("hi");
//this.name();
}
public TwoD(){
System.out.println("ghost");
}
public static void main(String[] args){
TwoD obj=new TwoD();
obj.thirlMovie();
System.out.println(obj.name);
//super.name();
//System.out.println(super.name);

}
}
