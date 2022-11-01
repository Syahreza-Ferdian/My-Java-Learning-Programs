public class exerciseNum13_192 {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            n++;
            if(Math.pow(n, 3) > 12000) break;
        }
        System.out.println(--n);
    }
}
