public class exerciseNum12_192 {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            n++;
            if(Math.pow(n, 2) > 12000) break;
        }
        System.out.println(n);
    }
}
