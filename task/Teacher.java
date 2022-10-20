public class Teacher
   {
public static void main(String[] args)
   {
     School obj=new School();
     obj.conduct_exams();
     obj.publish_results(75);
     System.out.println(obj.schoolname);
   int salary=2000; 
   //obj.salary();           //That's private not acess another class
   System.out.println(salary);
  }
}
