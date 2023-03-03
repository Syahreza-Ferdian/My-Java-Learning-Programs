public class test_oop {
    public static void main(String[] args) {
        lingkaran lingkaran1 = new lingkaran();

        System.out.printf("Luas lingkaran dengan jari jari %s adalah %s\n", Double.toString(lingkaran1.jariJari), Double.toString(lingkaran1.cariLuas()));

        lingkaran lingkaran2 = new lingkaran(25);
        System.out.printf("Luas lingkaran dengan jari jari %s adalah %s\n", Double.toString(lingkaran2.jariJari), Double.toString(lingkaran2.cariLuas()));

        lingkaran2.setJariJari(125);
        System.out.printf("Luas lingkaran dengan jari jari %s adalah %s\n", Double.toString(lingkaran2.jariJari), Double.toString(lingkaran2.cariLuas()));

        lingkaran lingkaran3 = new lingkaran(100);
        System.out.printf("Luas lingkaran dengan jari jari %s adalah %s\n", Double.toString(lingkaran3.jariJari), Double.toString(lingkaran3.cariLuas()));
    }    
}
class lingkaran{
    double jariJari;

    lingkaran(){
        jariJari = 1;
    }

    lingkaran(double jariJariBaru){
        jariJari = jariJariBaru;
    }

    double cariLuas(){
        return Math.PI * jariJari * jariJari;
    }

    double cariKeliling(){
        return Math.PI * 2 * jariJari;
    }

    void setJariJari(double jariJariBaru){
        jariJari = jariJariBaru;
    }
}