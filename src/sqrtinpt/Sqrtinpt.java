
package sqrtinpt;

import java.util.Scanner;


public class Sqrtinpt {

  
    public static void main(String[] args) {
        double radice;
        int num;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        
        num = input.nextInt();
        radice = Math.sqrt(num);
        System.out.println(radice);
    }
    
}
