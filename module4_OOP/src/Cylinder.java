public class Cylinder extends Sphere{
    private double radius;
    private double height;

    // constructors
    Cylinder() {
        this.radius = 0;
        this.height = 0;
    }
    
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // methods
    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }
    public void setHeight(double height) { this.height = height; }
    public double getHeight() { return height; }
    
    @Override
    double surfaceArea() {
        double circles = 2 * Math.PI * Math.pow(radius, 2);
        double rectangle = 2 * Math.PI * radius * height;
        return circles + rectangle;
    }

    @Override
    double volume() {
        return height * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        String infoString = String.format("Cylinder stats\nRadius: %.2f\nHeight: %.2f\nSurface Area: %.2f\nVolume: %.2f\n",
        height,
        radius,
        surfaceArea(),
        volume());
        return infoString;
    }
}
