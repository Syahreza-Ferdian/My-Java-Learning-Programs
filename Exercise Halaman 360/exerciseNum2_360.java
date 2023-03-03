public class exerciseNum2_360 {
    public static void main(String[] args) {
        Stock saham1 = new Stock("ORCL", "Oracle Corporation");
        saham1.previousClosingPrice = 34.5;
        saham1.currentPrice = 34.35;

        System.out.printf("%s (%s)\n", saham1.companyName, saham1.symbol);
        System.out.printf("%.2f\n", saham1.currentPrice);
        System.out.printf("Price-change percentage : %.2f %%", saham1.getChangePercent());
    }    
}
class Stock{
    String symbol;
    String companyName;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newCompanyName){
        symbol = newSymbol;
        companyName = newCompanyName;
    }

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
    }
}
