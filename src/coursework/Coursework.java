/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;
import java.util.Scanner;
/**
 *
 * @author DW600
 */
public class Coursework {

    
    public static int displayMenu()
    {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i <1 || i > 3)
        {
            System.out.println("1. Create 2D shpaes\n"
                              +"2. Creae 3D shapes\n"
                              +"3. Exit");
            i = sc.nextInt();
        }
        
        
        return i;
    }
    
    public static void chooseShapes(int dim)
    {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        if (dim == 2)
        {
            while (i <1 || i > 3)
            {
                System.out.println("1. Create Triangle\n"
                                  +"2. Create Circle\n"
                                  +"3. Create Rectangle");
                i = sc.nextInt();
            }
        }
        
        if (dim == 3)
        {
            while (i <1 || i > 2)
            {
                System.out.println("1. Create Sphere\n"
                                  +"2. Create Cylinder\n");
                i = sc.nextInt();
            }
        }
        
    }
    public static void exitProgram(int exitCode)
    {
        if (exitCode == 3)
            System.exit(0);
    }
    
    
    public static void main(String[] args) {
        int userChoice = displayMenu();
        exitProgram(3);
        
        System.out.printf("I = %d\n", userChoice);
    }
    
}
