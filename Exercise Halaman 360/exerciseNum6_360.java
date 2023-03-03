public class exerciseNum6_360 {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        int[] randomNumbers = new int[100_000];
        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = (int)(Math.random() * 100_000);
        }

        stopwatch.start();
        selectionSort(randomNumbers);
        stopwatch.stop();

        System.out.printf("Waktu pengurutan array menggunakan metode Selection Sort adalah %d milliseconds\n", stopwatch.getElapsedTime());

    }
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int currentMin = array[i];
            int currentMinIndex = i;
    
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < currentMin){
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
    
            if(currentMinIndex != i){
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
class StopWatch{
    private long startTime, endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }
    void start(){
        startTime = System.currentTimeMillis();
    }
    void stop(){
        endTime = System.currentTimeMillis();
    }
    long getElapsedTime(){
        return endTime - startTime;
    }
}
