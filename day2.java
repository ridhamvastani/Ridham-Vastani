import java.util.Scanner;
 
public class GetStudentDetails
{
      public static void main(String[] args)
      {
          String name;
          int roll, math, phy, eng;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
          System.out.print("Enter marks in Maths, Physics and English: ");
          math=SC.nextInt();
          phy=SC.nextInt();
          eng=SC.nextInt();
           
           
          System.out.println("Roll Number:" + roll +"\n Name: "+name);
          System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
       
            
      }
          
}
