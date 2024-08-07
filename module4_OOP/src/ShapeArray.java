public class ShapeArray {
    public static void main(String[] args) {
        // instantiate shapes
        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(5, 5);
        Cone cone = new Cone(5, 5);
        // add shapes to array
        Shape[] shapeArray = new Shape[]{sphere, cylinder, cone};

        // loop through array and print shape data
        for (Shape shape: shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
