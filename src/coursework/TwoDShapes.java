/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author Lenovo
 */
public class TwoDShapes {
    public class Circle extends Shapes
    {

        public Circle(String name, int noOfSides) {
            super(name, noOfSides);
        }
        public double getArea()
        {
            return 5;
        }
        
        public double getPerimeter()
        {
            return 5;
        }
        
        public double getVolume()
        {
            return 5;
        }
    }
    
    public class Triangle extends Shapes
    {

        public Triangle(String name, int noOfSides) {
            super(name, noOfSides);
        }
        public double getArea()
        {
            return 5;
        }
        
        public double getPerimeter()
        {
            return 5;
        }
        
        public double getVolume()
        {
            return 5;
        }
    }
    
    public class Rectangle extends Shapes
    {

        public Rectangle(String name, int noOfSides) {
            super(name, noOfSides);
        }
        public double getArea()
        {
            return 5;
        }
        
        public double getPerimeter()
        {
            return 5;
        }
        
        public double getVolume()
        {
            return 5;
        }
    }
}
