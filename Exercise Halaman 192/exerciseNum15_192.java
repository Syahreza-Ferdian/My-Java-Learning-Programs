public class exerciseNum15_192 {
    public static void main(String[] args) {
        //! = 33; ~ = 126
        int count = 0;
        for(int i = 33; i <= 126; i ++){
            System.out.printf("%s ", (char)i);
            count++;
            if(count % 10 == 0) System.out.println();
        }
    }
}
