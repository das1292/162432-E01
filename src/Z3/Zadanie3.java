package Z3;

import java.io.File;
import java.util.List;

public class Zadanie3 {
    public static String[] DirectoryList(String path){
        String[] result={};
        try{
            File f=new File(path);
            result=f.list((dir,name)->dir.isDirectory());
        }
        catch(Exception e){
        }
        return result;
    }
    public static void main(String[] args) {
        List.of(DirectoryList("C:\\Users\\Admin\\IdeaProjects\\162432-E01\\src")).forEach(System.out::println);
    }
}





