public class Cone extends Sphere{
    private double radius;
    private double height;

    // constructors
    Cone() {
        this.radius = 0;
        this.height = 0;
    }
    
    Cone(double radius, double height) {
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
        return Math.PI * radius * (radius + Math.sqrt( Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    double volume() {
        return Math.PI * Math.pow(radius, 2) * (height/3.0);
    }

    @Override
    public String toString() {
        String infoString = String.format("Cone stats\nRadius: %.2f\nHeight: %.2f\nSurface Area: %.2f\nVolume: %.2f\n",
        radius,
        height,
        surfaceArea(),
        volume());
        return infoString;
    }
}
