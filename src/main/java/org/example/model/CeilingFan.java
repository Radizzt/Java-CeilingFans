package org.example.model;

/**
 * CeilingFan --- Represent a Ceiling Fan
 *
 */
public class CeilingFan {

    /**
     * Speed of the fan, default is 0
     */
    private int speed = 0;
    /**
     * Direction of the fan, default is false
     */
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

    /**
     * Increase the speed value by one.
     * If the speed value is more than 3, it will return 0
     *
     */
    public void pullSpeedCord(){
        this.speed = (this.speed + 1) % 4;
    }

    /**
     * Set the reverse property to the opposite of current boolean
     */
    public void pullReverseCord(){
        this.reverse = !this.reverse;
    }


    /**
     * This method simply display all the object properties in a cleaner format
     * Note: for speed 0 it is display as 'off'
     * and for reverse property true is 'reverse', false is 'forward'
     */
    public void displayCurSetting(){
        System.out.printf("-----------------------%n");
        System.out.printf("Current Setting:%n");
        System.out.printf("Speed: %s%n", this.speed == 0? "off" : this.speed); //At speed 0, return 'off' instead
        System.out.printf("Direction: %s%n", this.reverse? "reverse" : "forward");
        System.out.printf("-----------------------%n");

    }
}
