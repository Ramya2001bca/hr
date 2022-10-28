
class Car extends Vehicle {
     //@Override-static method can,t be override-(we have to complie then show the static method can't be override)
public static void kmToMiles(int km) 
     {
          System.out.println("Inside the child class / static method");
     }
     
public static void main(String args []) {
      Car v = new Car();
      v.kmToMiles(10);
  }
}
