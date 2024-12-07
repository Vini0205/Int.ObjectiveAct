/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calunod_divine_circletest.java;

/**
 *
 * @author ACER
 */
public class Calunod_Divine_CircletestJava {

   public class Circle {
      
    private double radius;

  
    public Circle() {
        this.radius = 1.0; 
    }

   
    public Circle(double radius) {
        this.radius = radius;
    }

 
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

  
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    
    public double getDiameter() {
        return 2 * radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
}
}
    

