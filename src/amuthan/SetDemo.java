package amuthan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("swathi");//saves swathi only one time
        s.add("swathi");
        s.add("bedre");
        s.add("bk");

        Set<String> t = new HashSet<String>(s);//removes duplicates from list s
//        s.add("swathi");//saves swathi only one time
//        s.add("swathi");
//        s.add("bedre");
//        s.add("bk");
//        s.remove("bedre");
        for(String e: t){
            System.out.println(e);
        }
    }
}
