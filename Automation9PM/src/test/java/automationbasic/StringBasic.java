package automationbasic;

public class StringBasic {

    public static void main(String[] args) {

        String name = "learnmore"; //0,1,2
        int nameSize =name.length();
        System.out.println(nameSize);
        String sample = "training";
        String combain =name.concat(sample);
        System.out.println(combain);
       char i= name.charAt(2);
        System.out.println(i);
        String nameTwo = "LearnMore";
        name.equals(nameTwo);
        name.equalsIgnoreCase(nameTwo);
       String y= nameTwo.substring(5,9);
        System.out.println(y);

        nameTwo.replace('L','k');

        String t ="   123    ";
      // int numb= Integer.parseInt(t);  //numberformat

        t.toUpperCase();

        System.out.println(t.trim());

        String jj ="dfgggh 123 dgdghh";

        jj.contains("123");

    }
}
