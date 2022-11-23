public class exerciseNum13_276 {
    public static void main(String[] args) {
        int angka[] = {1,54};
        for(int i = 1; i <= 60; i++){
            System.out.printf("%2d ", getRandom(angka));
            if(i % 10 == 0) System.out.println();
        }
    }
    public static int getRandom(int[] angka){
        int batasBawah = angka[0] + 1;
        int batasAtas = angka[1] - 2;
        return (int)(Math.random()*batasAtas) + batasBawah;
    }
}
