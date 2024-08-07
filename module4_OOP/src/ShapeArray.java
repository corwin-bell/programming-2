public class ShapeArray {
    public static void main(String[] args) {
        // intantiate shapes
        Sphere sphere = new Sphere(5);
        // add shapes to array
        Shape[] shapeArray = new Shape[]{sphere};

        // loop through array and print shape data
        for (Shape shape: shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
