public class exerciseNum6_192 {
    public static void main(String[] args) {
        final double milesToKilometer = 1.609;

        System.out.printf("%-15s%s  %-20s%s\n", "Miles", "Kilometers   |","Kilometers", "Miles");
        for(int miles = 1, kilometers = 20; miles <= 10 ; miles++, kilometers += 5){
            System.out.printf("%2d%20.3f      |  %d%24.3f\n", miles, (milesToKilometer * miles), kilometers, (kilometers/milesToKilometer));
        }
    }
}

