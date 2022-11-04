public class SubClass extends SuperClass
    {
static void print()
{
System.out.println("This is the subclass");
}

public static void main(String[] args)
{
SuperClass sup1 = new SuperClass();
SuperClass sub2 = new SubClass();
sup1.print();
sub2.print();
}
}
