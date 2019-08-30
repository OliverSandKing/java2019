package Shapes;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;
 
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double area() {
        double p = (sideA + sideB + sideC) / 2;
        double toSquare = p * (p - sideA) * (p - sideB) * (p - sideC);
        double area = Math.sqrt(toSquare);

        return area;
    }

    public double circumference() {
        double circumference = sideA + sideB + sideC;
        return circumference;
    }

    public boolean correct() {
        return (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB);
    }
}