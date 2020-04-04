/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        
        double pi = 3.14159;
        
        myCircle.setRadius(0.0);
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the radius of your circle.");
        double radius = keyboard.nextDouble();
        myCircle.setRadius(radius);
        
        System.out.println("============================================");
        System.out.println("Radius: " + radius);
        double diameter = myCircle.getDiameter();
        System.out.println("Diameter: " + diameter);
        double area = myCircle.getArea();
        System.out.println("Area: " + area);
        double circumference = myCircle.getCircumference();
        System.out.println("Circumference: " + circumference);
        System.out.println("============================================");
        
        
        
       
        
    }
}
