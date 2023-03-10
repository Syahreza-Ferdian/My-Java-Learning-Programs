public class buatNgetest2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.setNopol("N 111 GA");
        System.out.println(mobil1.getNopol());
        
    }
    
}
class Mobil{
    private String nopol;

    public void setNopol(String s){
        nopol = s;
    }
    public String getNopol(){
        return nopol;
    }
}