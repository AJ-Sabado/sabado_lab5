
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author CpeLab_BE214
 */
public class Sabado_lab5_1 {
    static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    static String getInput() {
        String buffer = "";
        try {
            buffer = reader.readLine();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return buffer;
    }
    
    static int decimalToBinary(int val){
        int myArr[] = new int[32];
        int x = 0;
        while (val > 0) {
            if (val%2==0)
                myArr[x++] = 0;
            else
                myArr[x++] = 1;
            val /= 2;
        }
        String result = "";
        for(int a = x - 1; a >= 0; a--) {
            result += myArr[a];
        }
        
        return Integer.parseInt(result);
    }
    
    public static void main(String[] args) {
        
        System.out.print("Enter a positive decimal value: ");
        
        
        int originalValue = Integer.parseInt(getInput());
        
        System.out.println("""
                           Value to which number system:
                           
                           1-Decimal to Binary
                           2-Decimal to Octal
                           3-Decimal to Hexadecimal""");
        System.out.print("Enter value: ");
        
        int choice = Integer.parseInt(getInput());
        
        switch (choice) {
            case 1:
                System.out.println("Equivalent of " + originalValue + " in binary is " + decimalToBinary(originalValue));
                break;
            case 2:

            case 3:

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
