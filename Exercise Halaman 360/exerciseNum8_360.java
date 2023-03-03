public class exerciseNum8_360 {
    public static void main(String[] args) {
        // final int SLOW = 1;
        // final int MEDIUM = 2;
        // final int FAST = 3;

        Fan kipas1 = new Fan();
        Fan kipas2 = new Fan();
        
        kipas1.setFanSpeed(kipas1.FAST);
        kipas1.setRadius(10);
        kipas1.setColor("Yellow");
        kipas1.turnOn();

        kipas2.setFanSpeed(kipas2.MEDIUM);
        kipas2.setRadius(5);
        kipas2.setColor("Blue");
        kipas2.turnOff();

        System.out.println(kipas1.toStrings());
        System.out.println(kipas2.toStrings());
    }
}
class Fan{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //no-arg constructor
    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    //accessor
    String getFanSpeed(){
        String spd = "";
        if(speed == 1) spd = "SLOW";
        else if(speed == 2) spd = "MEDIUM";
        else if(speed == 3) spd = "FAST";

        return spd;
    }
    boolean getFanStatus(){
        return on;
    }
    double getRadius(){
        return radius;
    }
    String getFanColor(){
        return color;
    }

    //mutator
    void setFanSpeed(int newSpeed){
        speed = newSpeed;
    }
    void turnOn(){
        on = true;
    }
    void turnOff(){
        on = false;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
    void setColor(String newColor){
        color = newColor;
    }

    //method
    String toStrings(){
        String output = "";
        if(on) output = String.format("Fan Speed: %s, Color: %s, Radius: %s\n", getFanSpeed(), getFanColor(), String.valueOf(getRadius()));
        else output = String.format("Fan Color: %s, Radius: %s. FAN IS OFF\n", getFanColor(), String.valueOf(getRadius()));
        return output;
    }
}
