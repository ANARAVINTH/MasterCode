package automationbasic;

import java.util.ArrayList;
import java.util.List;

public class CollectionExamples {

    public static void main(String[] args) {

        List list = new ArrayList();

        List <Integer> list1 = new ArrayList<Integer>();

        List <String> list2 = new ArrayList<String>();

        list1.add(78);
        list1.add(100);

        list2.add("Aravinth");
        list2.add("learnmore");

        list.add(56);
        list.add("Abc");

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);

        list.add("jkl");

        System.out.println(list);


        list2.add(1,"hello");

        System.out.println(list2);

        list2.remove(2);
        System.out.println(list2);

        //for --> condition
        //for --> hasNext()


        for(String out:list2){
            System.out.println(out);
        }

        for(Object y:list){
            System.out.println(y);
        }


    }

}
