public class ShapeFactory {

    public static Shape getShape(int i) {

        switch (i) {
            case 1:
                return new Circles();
            case 2:
                return new Ractangle();
            case 3:
                return new Square();
            case 4:
                return new Triangle();
            default:
                System.out.println("Invalid choice..!");
                return null;
        }
    }
}
