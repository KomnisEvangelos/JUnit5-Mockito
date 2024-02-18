package org.example.Location;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Location {

    int x,y;


    public Location(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    public int getDistanceFromLocation(Location location){
            int distance;
           distance = Math.toIntExact(Math.round(sqrt(pow(location.getX() - this.x, 2) + pow(location.getY() - this.y, 2))));
        return distance;
    }
    public Location getLocation(){
        return this;
    }

    public int getX() {
        return x;
    }

    public void setX(int x1) {
        this.x = x1;
    }

    public int getY() {
        return y;
    }

    public void setY(int y1) {
        this.y = y1;
    }
}
