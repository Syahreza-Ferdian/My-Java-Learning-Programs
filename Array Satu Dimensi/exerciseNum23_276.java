public class exerciseNum23_276 {
    public static void main(String[] args) {
        final int JUMLAH_SISWA = 100;
        boolean[] locker = new boolean[JUMLAH_SISWA];
        for(int i = 0; i < locker.length; i++){
            locker[i] = false;
        }
        System.out.print("Locker yang terbuka: ");
        for(int i = 1; i <= JUMLAH_SISWA; i++){
            if(i == 1){
                for(int j = 0; j < locker.length; j++){
                    locker[j] = true;
                }
            }
            else if(i == 2){
                for(int j = 1; j < locker.length; j++){
                    locker[j] = false;
                }
            }
            else{
                for(int j = 2; j < locker.length; j++){
                    if((j + 1) % i == 0){
                        locker[j] = !(locker[j]);
                    }
                }
            }
            if(locker[i-1]) System.out.printf("%d ", i);
        }
    }
}
