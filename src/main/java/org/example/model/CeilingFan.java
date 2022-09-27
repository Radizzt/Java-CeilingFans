package org.example.model;

/**
 * CeilingFan --- Represent a Ceiling Fan
 *
 * @author Richard Huynh
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

    /**
     * Gets the current speed of the ceiling fan
     *
     * @return value of speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the current reverse boolean of the ceiling fan
     *
     * @return boolean value of reverse
     */
    public boolean isReverse() {
        return reverse;
    }


    //method

    /**
     * Increase the speed value by one.
     * If the speed value is more than 3, it will return 0
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
