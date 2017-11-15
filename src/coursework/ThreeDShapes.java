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
public class ThreeDShapes {
    public class Sphere extends Shapes
    {

        public Sphere(String name, int noOfSides) {
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
    
    public class Cylinder extends Shapes
    {

        public Cylinder(String name, int noOfSides) {
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
