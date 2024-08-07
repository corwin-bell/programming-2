public class Sphere extends Shape{
    private double radius;

    // constructors
    Sphere() {
        this.radius = 0;
    }
    
    Sphere(double radius) {
        this.radius = radius;
    }

    // methods
    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }

    @Override
    double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double volume() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        String infoString = String.format("Sphere stats\nRadius: %.2f\nSurface Area: %.2f\n", getRadius(), surfaceArea());
        return infoString;
    }

}
