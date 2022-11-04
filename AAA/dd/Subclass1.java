public class Subclass1 extends Superclass1
{
@Override
void print()
{
System.out.println("This is subclass");
}

public static void main(String[] args)
{
Superclass1 sup = new Superclass1();
Superclass1 sub = new Subclass1();
sup.print();
sub.print();
}
}
