import java.util.Random;

class ConcatenationInLoops  {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";
        for(int i = 0;i < 65536;i++)
            s += r.nextInt(2);
        System.out.println(System.currentTimeMillis() - start);
        
        Random p = new Random(123);
        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 65536;i++)
            sb.append(p.nextInt(2));
        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start1);
    }
}
