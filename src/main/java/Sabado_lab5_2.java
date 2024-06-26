
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CpeLab_BE214
 */
public class Sabado_lab5_2 {
    
    private final BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    
    public String getInput() {
        String a = "";
        try{
            a = this.buffer.readLine();
        }
        catch(IOException e){}
        return a;
    }
    
    public int sum(int arr[], int index) {
        if (index >= 0)
            return arr[index] + sum(arr, --index);
        return 0;
    }
    
    public float getPercentage(float a, float b) {
        return (a / b) * 100;
    }
    
    public void initialize() {
        System.out.print("How many integers will you enter? ");
        int size = Integer.parseInt(getInput());
        
        int myArray[] = new int[size];
        
        System.out.println("Enter 4 integers, one per line:");
        
        for (int i = 0; i <= size - 1; i++) {
            myArray[i] = Integer.parseInt(getInput());
        }
        
        System.out.println("The sum is " + sum(myArray, size - 1));
        System.out.println("The numbers are:\n");
        
        for (int i = 0; i <= size - 1; i++) {
            System.out.println(myArray[i] + " which is " + getPercentage(myArray[i], sum(myArray, size - 1)) + "% of the sum.");
        }
    }
    
    public static void main (String[] args) {
        Sabado_lab5_2 object = new Sabado_lab5_2();
        object.initialize();
    }
}
