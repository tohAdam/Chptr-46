public class Cone  {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate the surface area of the cylinder
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}
/*
public class CylinderTester {
    public static void main(String[] args) {
        // Creating a Cylinder object with radius 3 and height 5
        Cylinder cylinder = new Cylinder(3, 5);

        // Testing getter and setter methods
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());

        cylinder.setRadius(4);
        cylinder.setHeight(6);

        System.out.println("New radius: " + cylinder.getRadius());
        System.out.println("New height: " + cylinder.getHeight());

        // Testing volume and surface area methods
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.surfaceArea());
    }
}
*/
