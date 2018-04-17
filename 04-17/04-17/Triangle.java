public class Triangle {
    interface Measure {
        abstract void area();
    }
    class Triangle implements Measure {
        double a1;
        double high1;
        public Triangle(double a, double high) {
            a1 = a;
            high1 = high;
        }
        //public void perimeter(){
        //System.out.println("周長 = "+);
        //}
        public void show() {
            System.out.println("長 = " + a1 + "高 = " + high1);
        }

        public void area() {
            System.out.println("area = " + (a1 * high1) / 2);
        }
    }
}
