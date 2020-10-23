package rcarausu._32_generics_functions_and_erasure;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");

        // Can't check at runtime if strings is of type List<String>
        // Generics is a compile type feature, so it can only check if its a List
//        boolean b = strings instanceof List<String>;
        boolean b = strings instanceof List;
    }
}
