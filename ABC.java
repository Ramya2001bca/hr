public class ABC{

int age=18;

public int getAge(){
this.age;
System.out.println(age);
return age;

}
void checkAge(int age)
{
if(age<18){
System.out.println("not valid");

}
else
{
System.out.println("valid");
}
}
public static void main(String[] args){

ABC obj=new ABC();
int i = obj.getAge();
obj.checkAge(i);

}
}

