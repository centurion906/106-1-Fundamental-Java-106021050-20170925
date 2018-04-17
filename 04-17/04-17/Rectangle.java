public class Rectangle {
    interface Measure{
        abstract void area();
    }
    class Rectangle implements Measure{
        double width1;
        double height1;
        public Rectangle(double width, double height){
            width1 = width;
            height1 = height;
        }
        public void perimeter() {
            System.out.println("周長 = " + (width1 + height1) * 2);
        }
        public void show() {
            System.out.println("底 = " + width1 + "高 = " + height1);
        }
        public void area() {
            System.out.println("area = " + width1 * height1);
        }
    }
}
