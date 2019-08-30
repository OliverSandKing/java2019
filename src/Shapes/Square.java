
package Shapes;


public class Square {
    
    private double height;
    private double length;

    public Square(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
public double area(){
    double area = height * length;
    return area;
}
 public double circumference(){
     double circumference = height + height + length + length;
     return circumference;
 }   
}
