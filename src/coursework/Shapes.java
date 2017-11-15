/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author DW600
 */
public abstract class Shapes {
    private int noOfSides;
    private String name;
    
    public int getNoOfSides()
    {
        return noOfSides;
    }
    
    public Shapes(String name, int noOfSides)
    {
        this.name = name;
        this.noOfSides = noOfSides;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract double getVolume();
    public String getName()
    {
        return name;
    }
}
