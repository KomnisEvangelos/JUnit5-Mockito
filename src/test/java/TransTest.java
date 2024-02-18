import org.example.List.ListTransformer;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TransTest {

//    private ListTransformer listTransformer;
//    @BeforeEach
//    public void setup(){
//        listTransformer = new ListTransformer();
//    }
//
//    @AfterEach
//    public void tear_down(){
//        listTransformer = null;
//    }
    @Test
    public void  testSingleLowerCaseString(){
        String testString1 = "abc";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        List<String> result = ListTransformer.transofrmList(testList);
        assertEquals("ABC",result.get(0));

//        List<String> expectedList = new ArrayList<>();
//        expectedList.add("ABC");
//        assertEquals(expectedList,result);
    }

    @Test
    public void  testSingleUpperCaseString(){
        String testString1 = "ABC";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        List<String> result = ListTransformer.transofrmList(testList);
        assertEquals("ABC",result.get(0));

    }

    @Test
    public void  testSingleLowerAndUpperCaseString(){
        String testString1 = "ABCde";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        List<String> result = ListTransformer.transofrmList(testList);
        assertEquals("ABCDE",result.get(0));

    }

    @Test
    public void  testMultipleLowerCaseStrings(){
        String testString1 = "abc";
        String testString2 = "def";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        testList.add(testString2);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("ABC");
        expectedList.add("DEF");

        List<String> result = ListTransformer.transofrmList(testList);

        assertEquals(expectedList,result);

    }

    @Test
    public void  testMultipleLowerAndUpperCaseString(){
        String testString1 = "aBc";
        String testString2 = "deF";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        testList.add(testString2);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("ABC");
        expectedList.add("DEF");

        List<String> result = ListTransformer.transofrmList(testList);

        assertEquals(expectedList,result);

    }

    @Test
    public void  testMultipleLowerAndUpperCaseStrings(){
        String testString1 = "abc";
        String testString2 = "DEF";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        testList.add(testString2);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("ABC");
        expectedList.add("DEF");

        List<String> result = ListTransformer.transofrmList(testList);

        assertEquals(expectedList,result);

    }

    @Test
    public void  testMultipleNumericStrings(){
        String testString1 = "1561";
        String testString2 = "165165";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        testList.add(testString2);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("1561");
        expectedList.add("165165");

        List<String> result = ListTransformer.transofrmList(testList);

        assertEquals(expectedList,result);

    }

    @Test
    public void  testMultipleNumericAndStrings(){
        String testString1 = "1561sad";
        String testString2 = "165165asd";
        List<String> testList = new ArrayList<>();
        testList.add(testString1);
        testList.add(testString2);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("1561SAD");
        expectedList.add("165165ASD");

        List<String> result = ListTransformer.transofrmList(testList);

        assertEquals(expectedList,result);

    }

    @Test
    public void  testNullList(){
        List<String> testList = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();


        List<String> result = ListTransformer.transofrmList(testList);

        assertEquals(expectedList,result);

    }




}
