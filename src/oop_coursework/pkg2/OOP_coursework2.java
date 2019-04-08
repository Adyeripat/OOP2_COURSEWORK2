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
       
        
         System.out.println("Enter the first course unit");	
        String b = result.next();
        System.out.println("Input Marks for the first course unit");	
        int m  = result.nextInt();
        
       
                   
        
        System.out.println("Enter the second course unit");	
        String c = result.next();
        System.out.println(c);	
        
        System.out.println("Enter Marks for the second course unit");	
        int n  = result.nextInt();
               
        
          
       
                 
        System.out.println("Enter the third course unit");	
        String d = result.next();
        System.out.println(d);
        
        System.out.println("Enter Marks for the third course unit");	
       int z = result.nextInt();
               
        
           
            
                 System.out.println("Enter fourth course unit");	
        String e = result.next();
        System.out.println(e);	
        
        System.out.println("Enter Marks for the fourth course unit");	
       int h  = result.nextInt();
                
        
           
               
        
        System.out.println("Enter the fifth course unit");	
        String f = result.next();
        System.out.println(f);
        
        System.out.println("Enter Marks for the fifth course unit");	
       int q  = result.nextInt();
                
       
           
               
                 System.out.println("Enter the sixth course unit");	
        String g = result.next();
        System.out.println(g);	
        
        System.out.println("Enter Marks for the sixth course unit");	
        int r  = result.nextInt();
               
           
            sum = m+n+z+h+q+r;
            float a = (sum*100)/600;
            System.out.println("average is: "+ a);
        
                name.add(x);
                p++;
            }
                
            
        }
        
        
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
    }
    
}
