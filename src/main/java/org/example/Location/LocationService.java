package org.example.Location;

import org.example.Location.Location;

public class LocationService {

    private Location myLocation;
    public LocationService(Location location){
        myLocation = location;
    }

    public Location getLocation() {
        return myLocation;
    }
}
