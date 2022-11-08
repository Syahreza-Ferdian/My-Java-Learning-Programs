public class exerciseNum9_234 {
    public static void main(String[] args) {
        System.out.printf("%s\t\t%s\t\t%s\t%s\t\t%s\n", "Feet", "Meters", "|", "Meters", "Feet");
        for(double feet = 1, meters = 20; feet <= 10 && meters <= 65; feet++, meters += 5){
            System.out.printf("%.1f\t\t%.3f\t\t%s\t%.1f\t\t%.3f\n", feet, footToMeter(feet), "|", meters, meterToFoot(meters));
        }
    }
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
