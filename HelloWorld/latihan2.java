public class latihan2 {
    public static void main(String[] args){
        String person1 = "Paul McCartney";
        String person2 = "John Lennon";
        String person3 = "Paul McCartney";

        boolean compare1 = person1.equals(person2);
        boolean compare2 = person1.equals(person3);
        boolean compare3 = person2.equals(person3);

        // System.out.println(compare1);
        // System.out.println(compare2);

        if (compare1 == true|| compare2 == true || compare3 == true) {
            System.out.println("Kedua orang tersebut sama");
        }
        else if (compare1 == false || compare2 == false || compare3 == false) {
            System.out.println("Kedua orang tersebut berbeda");
        }
    }
}
