import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[100][100];
        int[][] matrix2 = new int[100][100];
        System.out.println("Please enter the size of the matrix:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Please enter the first matrix:");
        for(int i = 1;i <= n;i++)
            for(int j = 1;j <= m;j++)
                matrix1[i][j] = sc.nextInt();
        System.out.println("Please enter the second matrix:");
        for(int i = 1;i <= n;i++)
            for(int j = 1;j <= m;j++)
                matrix2[i][j] = sc.nextInt();
        System.out.println("The added matrix is: ");
        for(int i = 1;i <= n;i++)
            for(int j = 1;j <= m;j++){
                System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
            }
            System.out.print('\n');
    }
}
