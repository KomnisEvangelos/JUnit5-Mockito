import org.example.Location.Location;
import org.example.Location.LocationService;
import org.example.Location.NearService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestingLocation {

    @Mock
    LocationService locationService;

    @InjectMocks
    NearService nearService;


    @BeforeEach
    public void setup(){
        locationService = Mockito.mock(LocationService.class);
        nearService = new NearService(locationService);
    }
    @Test
    @DisplayName("(0,0) and (0,0) returns 1")
    public void _00_and_00_reutrns_1(){

        Mockito.when(locationService.getLocation()).thenReturn(new Location(0,0));

        int actualDistance = nearService.isNearTo(new Location(0,0));
        Assertions.assertEquals(1,actualDistance);
    }

    @Test
    @DisplayName("(0,0) and (10,10) returns 2")
    public void _00_and_1010_reutrns_2(){

        Mockito.when(locationService.getLocation()).thenReturn(new Location(0,0));

        int actualDistance = nearService.isNearTo(new Location(10,10));
        Assertions.assertEquals(2,actualDistance);
    }

}
