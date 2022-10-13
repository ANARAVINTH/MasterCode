package automationbasic;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(123,"Aravinth");
        hm.put(567,"Mahi");
        hm.put(342,"xyz");

        for(Map.Entry e:hm.entrySet()){

            System.out.println( e.getKey());
            System.out.println(e.getValue());

        }



    }
}
