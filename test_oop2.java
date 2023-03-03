public class test_oop2 {
    public static void main(String[] args) {
        TV televisi1 = new TV();
        televisi1.turnOn();
        televisi1.setVolume(30);
        televisi1.setChannel(3);

        TV televisi2 = new TV();
        televisi2.turnOn();
        televisi2.channelUp();
        televisi2.channelUp();
        televisi2.volumeUp();

        System.out.printf("Televisi 1's channel is %d and volume level is %d\n", televisi1.channel, televisi1.volumeLevel);
        System.out.printf("Televisi 2's channel is %d and volume level is %d\n", televisi2.channel, televisi2.volumeLevel);
    }
}
class TV{
    int channel = 1, volumeLevel = 1;
    boolean on = false;

    public TV(){
    }
    public void turnOn(){
        on = true;
    }
    public void trunOff(){
        on = false;
    }
    public void setChannel(int newChannel){
        channel = newChannel;
    }
    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
    public void channelUp(){
        if(on && channel < 120) channel++;
    }
    public void channelDown(){
        if(on && channel > 1) channel--;
    }
    public void volumeUp(){
        if(on && volumeLevel < 7) volumeLevel++;
    }
    public void volumeDown(){
        if(on && volumeLevel > 1) volumeLevel--;
    }
}
