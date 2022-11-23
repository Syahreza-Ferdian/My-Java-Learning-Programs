public class exerciseNum3_306 {
    public static void main(String[] args) {
        char[][] answer = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        String[] output = new String[answer.length];
        for(int i = 0; i < answer.length; i++){
            int correctCount = 0;
            for(int j = 0; j < answer[i].length; j++){
                if(answer[i][j] == keys[j]){
                    correctCount++;
                }
            }
            output[i] = String.format("Student %d's correct count is %d", i, correctCount);
        }
        sort(output);
        for (String string : output) {
            System.out.println(string);
        }
    }
    public static void sort (String[] array){
        for(int i = 0; i < array.length; i++){
            int panjangArr = array[i].length();
            int max1 = Integer.valueOf(array[i].substring(panjangArr - 1, panjangArr));
            for(int j = i + 1; j < array.length; j++){
                int max2 = Integer.valueOf(array[j].substring(panjangArr - 1, panjangArr));
                if(max2 < max1){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
