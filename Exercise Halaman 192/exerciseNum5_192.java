public class exerciseNum5_192 {
    public static void main(String[] args) {
        final double KILOGRAM_TO_POUNDS = 2.2;

        System.out.printf("%-15s%s   |   %-15s%s", "Kilograms", "Pounds", "Pounds", "Kilograms");
        for(int kilo = 1, lb = 20; kilo <= 199; kilo += 2, lb += 5){
            System.out.printf("\n%3d%18.1f   |   %3d%21.2f", kilo, kilo * KILOGRAM_TO_POUNDS, lb, lb/KILOGRAM_TO_POUNDS);
        }
    }
}
