import java.util.Scanner;

class Linear_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficents of the linear equation: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0){
            if(b == 0) System.out.println("Infinite solutions");
            else System.out.println("No solution");
        }else System.out.println("One solution: "+ (-b/a));
    }
}
