public class Point {
    // private member variables that represent the state of the point
    private double x;
    private double y;


    // construction.
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x0, double y0) {
        x = x0;
        y = y0;
    }

    //create a public method.
    public double getx() {
        return x;

    }
    public double gety() {
        return y;
    }

    public double getr() {
       double r = Math.sqrt(x*x+y*y);
       return r;
    }

    public double getTheta() {
        double theta = Math.atan2(y,x);
        return theta;
    }
//this function translates the point by dx and dy
    public void translate(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    // this function calculates the distance between this point and a user provided point.
    public double distance(Point p) {
        double dx = x - p.getx();
        double dy = y - p.gety();
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }

    public static void main(String[] args) {
        Point p;
        p = new Point();

        System.out.println("(x,y) = " + "("+ p.getx() + "," + p.gety()+")");

        Point q = new Point(3, 4);

         System.out.println("(x,y) = " + "("+ q.getx() + "," + q.gety()+")");
         System.out.println("radius = " + q.getr());
         System.out.println("angle is equal to: " + q.getTheta());
         System.out.println("Distance = " + q.distance(p));

         //translate our point
         q.translate(-3, -4);
          System.out.println("(x,y) = " + "("+ q.getx() + "," + q.gety()+")");

    }
}