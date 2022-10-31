//Java Program to demonstrate the use of static variable
class Student1{

int rollno;//instance variable
String name;
static String college ="ITS";//static variable

//constructor
Student1(int r, String n){
rollno = r;
name = n;
}

//method to display the values
void display (){

System.out.println(rollno+" "+name+" "+college);
}
public static void main(String[] args){
//Student1.college();
System.out.println(college);
Student1 obj=new Student1(15,"ramya");
obj.display();
}
}


