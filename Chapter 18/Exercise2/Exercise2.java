import java.util.Scanner;

public class Exercise2{
    public static void main(String[] args) {
        double inFrontleft;
        double inFrontRight;
        double inBackleft;
        double inBackRight;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the left front pressure:");
        inFrontleft = scan.nextInt();
        System.out.println("Enter the right front pressure:");
        inFrontRight = scan.nextInt();
        System.out.println("Enter the left rear pressure:");
        inBackleft = scan.nextInt();
        System.out.println("Enter the right rear pressure:");
        inBackRight = scan.nextInt();

        if (inFrontleft == inFrontRight && inBackleft == inBackRight){
            System.out.println("Everything looks right");
        }else{
            System.out.println("This isn't good");
        }



        



    }
}