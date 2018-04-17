public class Rectangle {
    interface Measure{
        abstract void area();
    }
    class Rectriangle implements Measure{
        double a1;
        double high1;
        public Rectangle(double a, double high){
            a1 = a;
            high1 = high;
        }
    }
}
