class AB{ 

void m()
    {
    System.out.println("hello m");
    }  
void n()
    {  
     System.out.println("hello n");  
   //m();//same as this.m()  
   this.m();  
    }  
      
//class TestThis4{  
public static void main(String args[]){  
AB a=new AB();  
a.n();  
    }
    }  
