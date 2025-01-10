import java.lang.Math;
package org.derryfield.math;
//added the setting modification but it didn't work


public class Geometry {
    public static double vol_sphere(double r) {
        return (4.0/3.0) * Math.PI * Math.pow(r,3);
    }
    public static double surf_area(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
import org.derryfield.math.Geometry;
public class GeometryDemo {
    public static void main(String[]args) {
       double radius = 5.0;
       double volume = Geometry.vol_sphere(radius);
       double surfacearea = Geometry.surf_area(radius);
       System.out.println("For a sphere with radius " + radius + ":");
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfacearea);
    }
}
