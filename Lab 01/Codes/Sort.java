import java.util.Scanner;

class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[100];
        for(int i = 1;i <= n;i++)
            array[i] = sc.nextInt();
        for(int i = 1;i <= n;i++){
            int pos = i;
            int min = array[i];
            for(int j = i;j <= n;j++){
                if(min > array[j]){
                    min = array[j];             //Find the miminum value 
                    pos = j;
                }
            }
            int temp = array[i];                //Swap array[i] with the minimum value
            array[i] = min;
            array[pos] = temp;                                    
        }
        for(int i = 1;i <= n;i++)
            System.out.print(array[i]+" ");
    }
}
