
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
public class Sabado_lab5_3 {
    
    private String studentArr[][] = new String[3][3];
    
    private final BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    
    public void setStudentArrValue(int x, int y, String entry) {
        this.studentArr[x][y] = entry;
    }
    
    public String getStudentArrValue(int x, int y) {
        return this.studentArr[x][y];
    }
    
    public String getInput() {
        String a = "";
        
        try{
            a = buffer.readLine();
        }
        catch(IOException e) {}
        
        return a;
    }
    
    public void setAll() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name of student: ");
            setStudentArrValue(i, 0, getInput());
            for (int j = 1; j < 3; j++) {
                System.out.print("Enter score " + j + ": ");
                setStudentArrValue(i, j, getInput());
            }
        }
        
        
    }
    
    public float average(String a, String b) {
        return (Float.parseFloat(a) + Float.parseFloat(b)) / 2;
    }
    
    public void getAll() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent: " + getStudentArrValue(i, 0));
            for(int j = 1; j < 3; j++) {
                System.out.println("Score " + j + ": "+ getStudentArrValue(i, j));
            }
            System.out.println("Average: " + average(getStudentArrValue(i, 1), getStudentArrValue(i, 2)));
        }
    }
      
    public static void main(String[] args) {
        Sabado_lab5_3 object = new Sabado_lab5_3();
        object.setAll();
        object.getAll();
    }
}
