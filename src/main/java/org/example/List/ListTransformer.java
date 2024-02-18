package org.example.List;

import java.util.ArrayList;
import java.util.List;

public class ListTransformer {

    public static List<String> transofrmList(List<String> inputList){
        List<String> reusult = new ArrayList<>();
        for (String word: inputList){
            reusult.add(word.toUpperCase());
        }
        return reusult;
    }
}
