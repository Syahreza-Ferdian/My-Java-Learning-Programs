public class exerciseNum16_276 {
    public static void main(String[] args) {
        long timerMulai, timerSelesai, waktuEksekusi; //waktu
        System.out.println("===>>> Program men-generate integer 3 digit secara random sebanyak 100.000 kali, dan disimpan ke dalam array. <<<===");
        timerMulai = System.currentTimeMillis();
        int[] array = new int[100000];
        int pencarian = (int)(Math.random()*1000);
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 1000);
        }
        System.out.println("Hasil pencarian menggunakan Linear Search: ");
        System.out.printf("Nilai integer %d ditemukan pada elemen array index ke %d\n", pencarian, linearSearch(array, pencarian));
        timerSelesai = System.currentTimeMillis();
        waktuEksekusi = timerSelesai - timerMulai;
        System.out.printf("Waktu eksekusi pada pencarian linear adalah: %f detik\n\n", waktuEksekusi/1000.0);
                                   
        System.out.println(">>>=== Array diurutkan dari nilai terkecil ke terbesar, lalu dilakukan pencarian menggunakan Linear Search dan Binary Search <<<===");
        timerMulai = System.currentTimeMillis();
        selectionSort(array); 
        System.out.println("Hasil pencarian menggunakan Binary Search: ");
        System.out.printf("Nilai integer %d ditemukan pada elemen array index ke %d\n", pencarian, binarySearch(array, pencarian));
        timerSelesai = System.currentTimeMillis();
        waktuEksekusi = timerSelesai - timerMulai;
        System.out.printf("Waktu eksekusi pada Binary Search dan mengurutkan array terlebih dahulu adalah: %f\n\n", waktuEksekusi/1000.0);

        timerMulai = System.currentTimeMillis();
        System.out.println("Hasil pencarian menggunakan Linear Search: ");
        System.out.printf("Nilai integer %d ditemukan pada elemen array index ke %d\n", pencarian, linearSearch(array, pencarian));
        timerSelesai = System.currentTimeMillis();
        waktuEksekusi = timerSelesai - timerMulai;
        System.out.printf("Waktu eksekusi pada Linear Search dan mengurutkan array terlebih dahulu adalah: %f\n", waktuEksekusi/1000.0);
    }
    public static int linearSearch(int[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(key == array[i]) return i;
        }
        return -1;
    }
    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;
        while(high >= low){
            int mid = (high + low)/2;
            if(key < array[mid]) high = mid - 1;
            else if(key == array[mid]) return mid;
            else low = mid + 1;
        }
        return -low -1;
    }
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
