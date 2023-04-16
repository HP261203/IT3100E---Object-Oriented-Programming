import java.util.Scanner;

class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        if(month > 12 || month < 1 || year < 0) System.out.print("Invalid value!");
        else{
            if(month == 2){
                if(year % 100 == 0){
                    if(year % 400 != 0) System.out.print("28");
                    else System.out.print("29");
                }else{
                    if(year % 4 == 0) System.out.print("29");
                    else System.out.print("28");
                }
            }
            else{
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                    System.out.print("31");
                else System.out.print("30");
            }
        }
    }
}
