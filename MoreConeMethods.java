public class MoreConeMethods {
    private double radius;
    private double height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the slant height
    public double slantHeight() {
        return Math.sqrt(radius * radius + height * height);
    }

    // Method to calculate the angle at the apex of the cone
    public double angle() {
        return Math.atan(radius / height);
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }
}
