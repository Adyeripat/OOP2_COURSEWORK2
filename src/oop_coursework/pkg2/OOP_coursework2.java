/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_coursework.pkg2;
import java.util.ArrayList;
import java.util.Scanner;
public class OOP_coursework2 {

    
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList();
        Scanner result=new Scanner(System.in);
        System.out.println("Enter student(enter exit when done)");
        int p = 1;
        while (true) {
            System.out.println("Student name: " + p + ": ");
            String x =result.next();
            if(x.toLowerCase().equals("exit"))
                break;
            else
            {
                 int mark[]=new int[7];
        int i = 0;
        String grd;
        float sum=0;
        Scanner scan= new Scanner(System.in);
         System.out.println("Enter the first course unit");	
        String b = scan.next();
        System.out.println("Input Marks for the first course unit");	
        String m  = scan.next();
        
        mark[i] = scan.nextInt();
            sum = sum + mark[i];       
         
        System.out.println("Enter the second course unit");	
        String c = scan.next();
        System.out.println(c);	
        
        System.out.println("Enter Marks for the second course unit");	
        String n  = scan.next();
               
         mark[i] = scan.nextInt();
            sum = sum + mark[i];
       
                 
        System.out.println("Enter the third course unit");	
        String d = scan.next();
        System.out.println(d);
        
        System.out.println("Enter Marks for the third course unit");	
        String z = scan.next();
               
         mark[i] = scan.nextInt();
            sum = sum + mark[i];
            
                 System.out.println("Enter fourth course unit");	
        String e = scan.next();
        System.out.println(e);	
        
        System.out.println("Enter Marks for the fourth course unit");	
        String h  = scan.next();
                
         mark[i] = scan.nextInt();
            sum = sum + mark[i];
               
        
        System.out.println("Enter the fifth course unit");	
        String f = scan.next();
        System.out.println(f);
        
        System.out.println("Enter Marks for the fifth course unit");	
        String q  = scan.next();
                
         mark[i] = scan.nextInt();
            sum = sum + mark[i];
               
                 System.out.println("Enter the sixth course unit");	
        String g = scan.next();
        System.out.println(g);	
        
        System.out.println("Enter Marks for the first course unit");	
        String r  = scan.next();
               
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
            float a = (sum*100)/600;
            System.out.print("average is: "+ a);
            
                name.add(x);
                p++;
            }
                
            
        }
        
        
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
    }
    
}
