public class Shape {
    interface Measure {
        final double PI = 3.14;
        abstract void area();
        }
        class Circle implements Measure {
            double r1;
            public Circle(double r) {
                r1 = r;
            }
            public void perimeter() {
                System.out.println("周長 = " + PI * 2 * r1);
            }
            public void show() {
                System.out.println("半徑 = " + r1);
            }
            public void area() {
                System.out.println("area = " + PI * r1 * r1);
            }
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
        class Rectangle extends Shape implements Measure {
            double width1;
            double height1;
            public Rectangle(double width, double height) {
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