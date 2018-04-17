public class Circle implements Measure{


        double r1;
        public Circle(double r){
            r1 = r;
        }
        public void perimeter(){
            System.out.println("周長 = " + PI * 2 * r1);
        }
        public void show(){
            System.out.println("半徑 = " + r1);
        }
        public void area(){
            System.out.println("area = " + PI * r1 * r1);
        }
    }



