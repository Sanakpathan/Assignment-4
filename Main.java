//Sana Pathan 
class Shape {
    private int numOfSides;

    public Shape(int numOfSides) {
        this.numOfSides = numOfSides;
    }
    public int getNumOfSides(){
        return numOfSides;
    }
    public void setNumOfSides(int numOfSides){
        this.numOfSides = numOfSides;
    }
}
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super(0); 
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super(4);
        this.length = length;
        this.width = width;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(6);
        System.out.println("Circle sides: " + c.getNumOfSides());

        Rectangle r = new Rectangle(5, 8);
        System.out.println("Rectangle sides: " + r.getNumOfSides());
    }
}
