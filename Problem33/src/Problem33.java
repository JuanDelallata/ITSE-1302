/**
 * Juan Delallata
 * ITSE 1301
 * Test 1 Problem 33
 */
public class Problem33 {

    public static void main (String [] strArgs) {

        final double PI = 3.14159;
        int radius = 10;
        double area = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        radius = 20; area = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        double circumference = (PI * 2) + radius;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);


    }
}
