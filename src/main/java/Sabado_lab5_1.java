
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
    
    static int myArr[] = new int[32];
    
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
    
    static String decimalToBinary(int val){
        int x = 0;
        while (val > 0) {
            myArr[x++] = val%2;
            val /= 2;
        }
        String result = "";
        
        for(int a = x - 1; a >= 0; a--) {
            result += myArr[a];
        }
        
        return result;
    }
    
    static String decimalToOctal(int val) {
        int x = 0;
        while (val > 0) {
            myArr[x++] = val%8;
            val /= 8;
        }
        String result = "";
        
        for(int a = x - 1; a >= 0; a--) {
            result += myArr[a];
        }
        
        return result;
    }
    
    static String decimalToHex (int val) {
        int x = 0;
        while (val > 0) {
            myArr[x++] = val%16;
            val /= 16;
        }
        String result = "";
        
        for(int a = x - 1; a >= 0; a--) {
            if (myArr[a] > 9) {
                result += myArr[a] == 15 ? "F" :
                        myArr[a] == 14 ? "E" :
                        myArr[a] == 13 ? "D" :
                        myArr[a] == 12 ? "C" :
                        myArr[a] == 11 ? "B" : "A";
            }
            else
                result += myArr[a];
        }
        
        return result;
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
                System.out.println("Equivalent of " + originalValue + " in octal is " + decimalToOctal(originalValue));
                break;
            case 3:
                System.out.println("Equivalent of " + originalValue + " in hexadecimal is " + decimalToHex(originalValue));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
