public class RectangleRunner {
    public static void main(String [] args) {
        Rectangle rect1 = new Rectangle(10,20);
        int area1 = rect1.calculateArea();
        double vol1 =rect1.calculateBoxVolume(25);
        System.out.println("This rectangle has an area of " + area1 + " and a volume of " + vol1);
//        rect1.printArea();
//        rect1.printBoxVolume(25);

    }
}
