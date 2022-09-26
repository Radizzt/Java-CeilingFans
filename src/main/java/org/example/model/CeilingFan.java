package org.example.model;

public class CeilingFan {
    private int speed = 0;
    private boolean reverse = false;

    //getter
    public int getSpeed(){
        return speed;
    }

    public boolean getReverse(){
        return reverse;
    }

    //setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    //method

    /*
     * Speed will increased by one. if current speed is at 3, will change to 0
     */
    public void pullSpeedCord(){
        this.speed = (this.speed + 1) % 4;
    }

    /*
     * set reverse to the opposite of current boolean
     */
    public void pullReverseCord(){
        this.reverse = !this.reverse;
    }

    public void displayCurSetting(){
        System.out.printf("-----------------------%n");
        System.out.printf("Current Setting:%n");
        System.out.printf("Speed: %s%n", this.speed == 0? "off" : this.speed); //At speed 0, return 'off' instead
        System.out.printf("Direction: %s%n", this.reverse? "reverse" : "forward");
        System.out.printf("-----------------------%n");

    }
}
