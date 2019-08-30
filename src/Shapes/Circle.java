
package Shapes;


public class Circle {

    private final double PI = 3.14;
    private double radius;
    
    public Circle(double radie){
        this.radius = radie;
    }
    public double getRadie() {
        return radius;
    }
    public void setRadie(double radie){
        this.radius = radie;
    }
    public double area(){
            double area = radius * radius * PI;
            return area;
    }
    public double circumference(){
        double circumference = (radius * 2) * PI;
        return circumference;
    }
}
