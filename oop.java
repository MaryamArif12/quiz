class pen{
String color;
public void printcolor(){
System.out.println("the color of this pen is"+this.color);
}
}
public class oop{
public static void main(String []args){
pen p1=new pen();
p1.color= "blue";
pen p2=new pen();
p2.color= "red";
pen p3=new pen();
p3.color= "black";
p1.printcolor();
p2.printcolor();
p3.printcolor();
}
}
