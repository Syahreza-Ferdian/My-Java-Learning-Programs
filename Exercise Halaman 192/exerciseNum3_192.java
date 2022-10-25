public class exerciseNum3_192 {
    public static void main(String[] args) {
        final double KILOGRAM_TO_POUNDS = 2.2;

        System.out.printf("%-15s%s", "Kilograms", "Pounds");
        for(int kilo = 1; kilo <= 199; kilo += 2){
            System.out.printf("\n%3d%18.1f", kilo, kilo * KILOGRAM_TO_POUNDS);
        }
    }
}
