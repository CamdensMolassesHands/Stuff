
package helloworldjd;

import java.util.Scanner;


public class HelloWorldJD {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("pick a number");
        
        String firstNum = scan.nextLine();
        
        System.out.println("pick a second number");
        
        String secondNum = scan.nextLine();
        
        int x = Integer.parseInt(firstNum);
        
        int y = Integer.parseInt(secondNum);
        
        int Answer1 = x + y;
        int Answer2 = x - y;
        int Answer3 = x * y;
        double Answer4 = x / y;
        System.out.println("  ");
        System.out.println("x + y =" + Answer1);
        System.out.println("x - y =" + Answer2);
        System.out.println("x * y =" + Answer3);
        System.out.println("x / y =" + Answer4);
    }
    
}
//this is my hello world program; 
