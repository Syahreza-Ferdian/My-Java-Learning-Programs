public class exerciseNum33_192 {
    public static void main(String[] args) {
        System.out.println("Perfect Number adalah angka di mana hasil penjumlahan semua faktor-faktornya (kecuali dirinya sendiri) sama dengan angka tersebu");
        System.out.println("Berikut ini adalah Perfect Number dari 1 sampai 10000");
        for(int i = 1; i <= 10000; i++){
            int sum = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            if (sum == i){
                System.out.printf("%d ", i);
            }
        }
    }
}
