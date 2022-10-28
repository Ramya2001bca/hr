public class Trainer{
String name;
String departMent;
String Email_id;
long phone_Number;
int adhar_Number;

public Trainer(String ka,String dp,String em)
     {       
            String name="ka";
            String departMent="dp";
            String Email_id="em";
            System.out.println(ka+"\n"+dp+"\n"+em);
            }
public Trainer(String km,String dh,long ph)
    {
            String name="km";
            String departMent="dh";
       long phone_Number=ph;
            System.out.println(km+"\n"+dh+"\n"+ph);
            }
public Trainer(String abc,String dull,int adhar)
    {
            String name="abc";
            String departMent="dull";
      int adhar_Number=adhar;
          System.out.println(abc+"\n"+dull+"\n"+adhar);
            }
public static void main(String[] args)
{
Trainer obj1=new Trainer("ramya","Testing","ramya@gmail.com");
Trainer obj2=new Trainer("mathavi","dev","mathavi@gmail.com");
Trainer obj3=new Trainer("hi","devops","hi@gimail.com");
}
}

