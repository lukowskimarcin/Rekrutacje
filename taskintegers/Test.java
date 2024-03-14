package taskintegers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {

    public String toUppers(String input) {
        var result =  Arrays.stream(input.split("\\s+"))
            .map(e ->  e.length() > 1 ? (""+e.charAt(0)).toUpperCase() + e.substring(1, e.length()).toLowerCase() : (""+e.charAt(0)).toUpperCase() )
            .collect(Collectors.joining(" "));
        return result;
    }




    public static void main(String[] args) {
        var x = new Test();
        System.out.println(x.toUppers("ala ma koTa o imieniu maja"));
    }
    
}
