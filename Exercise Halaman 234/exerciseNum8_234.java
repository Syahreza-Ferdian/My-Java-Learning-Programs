public class exerciseNum8_234 {
    public static void main(String[] args) {
        System.out.println("Tabel konversi suhu antara celcius dan fahrenheit: \n");
        System.out.printf("%s\t\t%s\t%s\t%s\t%s\n", "Celcius", "Fahrenheit", "|", "Fahrenheit", "Celcius");
        for(double celcius = 40, fahrenheit = 120; celcius >= 31 && fahrenheit >= 30; celcius--, fahrenheit -= 10){
            System.out.printf("%.1f\t\t%.1f\t\t%s\t%.1f\t\t%.2f\n", celcius, celciusToFahrenheit(celcius), "|", fahrenheit, fahrenheitToCelcius(fahrenheit));
        }
    }
    public static double celciusToFahrenheit(double celcius){
        return (9.0/5) * celcius + 32;
    }
    public static double fahrenheitToCelcius(double fahrenheit){
        return (5.0/9) * (fahrenheit - 32);
    }
}
