import java.io.*;
import java.util.*;
class p1{
 public static void main(String[]args){
  System.out.println("hello word");
 Scanner sc=new Scanner(System.in);
 System.out.println("enter name:");
String name=sc.nextLine();
System.out.println("enter your rool no:");
int num=sc.nextInt();
System.out.println("ent you maks in math in 12:");
double mark=sc.nextDouble();
System.out.println("part II");
System.out.println("enter first number:");
int n1=sc.nextInt();
System.out.println("enter the second number");
int n2=sc.nextInt();
System.out.println("addition of two numbers is:");

 int add=n1+n2;
System.out.println(add);
System.out.println("substaction of two numbers is:");
int sub=n1-n2;
System.out.println(sub);
System.out.println("multiplication of two numberes is:");
int mul=n1*n2;
System.out.println(mul);
System.out.println("devidation of two numbers are:");
int div=n1/n2;
System.out.println(div);
System.out.println("modulus of two numbers is:");
int mod=n1%n2;
System.out.println(mod);



}
}