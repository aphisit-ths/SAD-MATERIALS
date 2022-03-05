

public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());
        System.out.println("==== Square ====");
        Square square01 = new Square(2);
        System.out.println("Width = " + square01.getWidth());
        System.out.println("Height = " + square01.getHight());
        System.out.println("Area = " +  square01.getArea());
        
    }
}
