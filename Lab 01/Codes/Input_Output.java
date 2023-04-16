import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double height;
        System.out.println("Please enter your name: ");
        name = sc.next();
        System.out.println("Your name is " + name);
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        System.out.println(name + " is " + age + " years old");
        System.out.println("Please enter your height");
        height = sc.nextDouble();
        System.out.println(name + " height's is " + height);
    }
}
