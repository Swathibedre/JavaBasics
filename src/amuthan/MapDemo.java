package amuthan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"swathi");
        m.put(3,"bk");
        m.put(3,"bktest");
        m.put(2,"swathi");
       Set<Integer> i=  m.keySet();
        for (Integer e: i  ) {
            System.out.print(e+" ");
            System.out.println(m.get(e));
        }
        
    }
}
