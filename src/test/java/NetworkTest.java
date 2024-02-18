
import org.example.Network.MessageService;
import org.example.Network.Network;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class NetworkTest {

    @Mock
    Network network;
    @InjectMocks
    MessageService messageService;

    @BeforeEach
    public void setup(){
        messageService = new MessageService(network);
    }

    @AfterEach
    public void tear_down(){
        messageService = null;
    }

    @Test
    public void testSuccesOnFirstTry(){
        Mockito.when(network.sendMessage("192.168.1","Hello")).thenReturn(true);

        Boolean result = messageService.sendMessage("192.168.1","Hello");

        Assertions.assertEquals(true,result);


    }

    @Test
    public void testSuccesOnSecondTry(){
        Mockito.when(network.sendMessage("192.168.1","Hello")).thenReturn(false,true);

        Boolean result = messageService.sendMessage("192.168.1","Hello");

        Assertions.assertEquals(true,result);


    }
    @Test
    public void test2FailTries(){
        Mockito.when(network.sendMessage("192.168.1","Hello")).thenReturn(false,false);

        Boolean result = messageService.sendMessage("192.168.1","Hello");

        Assertions.assertEquals(false,result);


    }


}


