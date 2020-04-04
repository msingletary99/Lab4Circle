/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
public class Circle {
    public double radius;
    public double pi;
    public double area;
    public double circumference;
    public double diameter;

public void setRadius(double radius){
    this.radius=radius;
}
    
public double getRadius(){
    return radius;

}

public void setPi(double pi){
    this.pi=pi;
}

public double getPi(){
    return pi;
}

public double getArea(){
    this.area = pi*radius*radius;
    return area;
}
public double getCircumference(){
    this.circumference = 2*pi*radius;
    return circumference;
}

public double getDiameter(){
    this.diameter = 2*radius;
    return diameter;
}
}

