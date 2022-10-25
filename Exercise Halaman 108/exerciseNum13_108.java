import java.util.Scanner;

public class exerciseNum13_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.printf("%-10s: \n", "Filling status"); 
       System.out.println("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household)");
       System.out.printf("%-30s: ", "Enter the filing status");
       int status = scanner.nextInt();
       System.out.printf("%-30s: ", "Enter the taxable income");
       double pendapatan = scanner.nextDouble();

       double pajak = 0;
       switch(status){
            case 0: {
                if(pendapatan <= 8350){
                    pajak = pendapatan * 0.1;
                }
                else if(pendapatan <= 33950){
                    pajak = (8350 * 0.1) + ((pendapatan-8350)*0.15);
                }
                else if(pendapatan <= 82250){
                    pajak = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((pendapatan - 33950)*0.25);
                }
                else if(pendapatan <= 171550){
                    pajak = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (pendapatan - 82250)*0.28;
                }
                else if(pendapatan <= 372950){
                    pajak = 8350 * 0.1 + (33950 - 8350)*0.15 + (82250 - 33950)*0.25 + (171550 - 82250)*0.28 + (pendapatan - 171550)*0.33;
                }
                else{
                    pajak = 8350 * 0.10 + (33950 - 8350)*0.15 + (82250 - 33950)*0.25 + (171550 - 82250)*0.28 + (372950 - 171550)*0.33 + (pendapatan - 372950)*0.35;
                }
            }break;
            case 1: {
                if(pendapatan <= 16700){
                    pajak = pendapatan * 0.1;
                }
                else if(pendapatan <= 67900){
                    pajak = (16700 * 0.1) + ((pendapatan-16700)*0.15);
                }
                else if(pendapatan <= 137050){
                    pajak = (16700 * 0.1) + ((67900 - 16700) * 0.15) + ((pendapatan - 67900) *0.25);
                }
                else if(pendapatan <= 208350){
                    pajak = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (pendapatan - 137050)*0.28;
                }
                else if(pendapatan <= 372950){
                    pajak = 16700 * 0.1 + (67900 - 16700)*0.15 + (137050 - 67900)*0.25 + (208850 - 137050)*0.28 + (pendapatan - 208850)*0.33;
                }
                else{
                    pajak = 16700 * 0.1 + (67900- 16700)*0.15 + (137050 - 67900)*0.25 + (208850 - 137050)*0.28 + (372950 - 208850)*0.33 + (pendapatan - 372950)*0.35;
                }
            }break;
            case 2:{
                if(pendapatan <= 8350){
                    pajak = pendapatan * 0.1;
                }
                else if(pendapatan <= 33950){
                    pajak = (8350 * 0.1) + ((pendapatan-8350)*0.15);
                }
                else if(pendapatan <= 68525){
                    pajak = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((pendapatan - 33950)*0.25);
                }
                else if(pendapatan <= 104425){
                    pajak = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (pendapatan - 68525)*0.28;
                }
                else if(pendapatan <= 186475){
                    pajak = 8350 * 0.1 + (33950 - 8350)*0.15 + (68525 - 33950)*0.25 + (104425 - 68525)*0.28 + (pendapatan - 104425)*0.33;
                }
                else{
                    pajak = 8350 * 0.10 + (33950 - 8350)*0.15 + (68525 - 33950)*0.25 + (104425 - 68525)*0.28 + (186475 - 104425)*0.33 + (pendapatan - 186475)*0.35;
                }
            }break;
            case 3: {
                if(pendapatan <= 11950){
                    pajak = pendapatan * 0.1;
                }
                else if(pendapatan <= 45500){
                    pajak = (11950 * 0.1) + ((pendapatan-11950)*0.15);
                }
                else if(pendapatan <= 117450){
                    pajak = (11950 * 0.1) + ((45500 - 11950) * 0.15) + ((pendapatan - 45500)*0.25);
                }
                else if(pendapatan <= 190200){
                    pajak = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (pendapatan - 117450)*0.28;
                }
                else if(pendapatan <= 372950){
                    pajak = 11950 * 0.1 + (45500 - 11950)*0.15 + (117450 - 45500)*0.25 + (190200 - 117450)*0.28 + (pendapatan - 190200)*0.33;
                }
                else{
                    pajak = 11950 * 0.1 + (45500 - 11950)*0.15 + (117450 - 45500)*0.25 + (190200 - 117450)*0.28 + (372950 - 190200)*0.33 + (pendapatan - 372950)*0.35;
                }
            }break;
            default: System.out.println("ERROR: Invalid status"); break;
       }
       System.out.printf("Tax is %s", Double.toString((int)(pajak*100)/100.0));
    }
}