import java.util.Scanner;

public class Exercise1
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    int chekcings;
    int savings;

    System.out.print("How much is in your checking account? ");
    chekcings =  scan.nextInt();

    System.out.print("How much is in your savings account? ");
    savings =  scan.nextInt();

    if ( chekcings > 1000 || savings > 1500) 
      System.out.println("No service charge");
    else 
      System.out.println("Service charge is $0.15");
  }
}