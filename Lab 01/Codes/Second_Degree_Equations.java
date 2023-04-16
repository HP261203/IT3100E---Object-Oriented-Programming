import java.util.Scanner;
import java.lang.Math;

class Second_Degree_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the coefficents of the equations: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                if(c != 0) System.out.println("No solution!");
                else System.out.println("Infinite solution!");
            }else System.out.println(-c/b);
        }
        else{
            double delta = b*b-4*a*c;
            if(delta < 0) System.out.println("No real solution!");
            else if(delta == 0) System.out.println("Double solution: " + (-b/(2*a)));
            else{
                double x_1 = (-b-Math.sqrt(delta))/(2*a);
                double x_2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.println("Two real solutions: " + x_1 + " " + x_2);
            }
        }
    }
}
