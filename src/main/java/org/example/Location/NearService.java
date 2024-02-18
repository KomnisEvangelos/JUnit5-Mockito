package org.example.Location;

public class NearService   {
    private LocationService locationService;

    public NearService(LocationService locationService){
        this.locationService = locationService;
    }

    public int isNearTo(Location location){

       Location myLocation = locationService.getLocation();
       int distance = myLocation.getDistanceFromLocation(location);
       if(distance < 10){
           return 1;
       }
       else if (distance >= 10 && distance<=20){
           return  2;
       } else {
           return 3;
       }
    }
}
