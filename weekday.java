import java.io.*;
import java.util.*;
class weekday{
  public static void main(String[]args){
   System.out.println("1.sunday\n2.monday\n3.tuesaday\n4.wenseday\n5.thirsday\n6.friday\n7.satureday");
    Scanner sc=new Scanner(System.in);
   System.out.println("eneter your choise from 1to7");
   int num=sc.nextInt();
   switch(num)
   {     case 1:
      System.out.println("sunday");
       break;
      case 2:
      System.out.println("monday");
       break;
       case 3:
      System.out.println("tuseday");
      break;
      case 4:
      System.out.println("wensday");
       break;
       
      case 5:
      System.out.println("thirsday");
       break;
       case 6:
       System.out.println("friday");
       break;
       case 7:
       System.out.println("satureday");
        break;

        default:
        System.out.println("invalid choise please enter the number from 1to7");
       
               
     }
}
}





