package Z3;

import java.util.Arrays;
import java.io.File;
import java.util.Objects;

public class Zadanie3 {
    public static void main(String[] args) {
        File folder=new File("src/");
        String[]str=folder.list();
        Arrays.stream(str).map(i->i).filter(Objects::nonNull).forEach(System.out::println);
    }
}
