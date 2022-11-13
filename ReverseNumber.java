class ReverseNumber{
public static void main(String[] args) {
        int num=1234;
        int count=1;
while(num>0) {
	System.out.print(num%10);
	num=num/10;
	count=count+1;
	}
	System.out.println("\n"+count);
  }
}
