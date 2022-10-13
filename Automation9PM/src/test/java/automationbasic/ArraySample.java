package automationbasic;

public class ArraySample {

    public static void main(String[] args) {

        int [] setOne = {23, 7, 9,28};  // size is fixed

        int [] h = new int[3];

        h[0] =34;
        h[1] = 5;
        h[2] =8;
        h[3] =56;

        //0,1,2,3

        String [] s = {"Aravinth","learnmore"};

        for(String output:s){               //hasNext
            System.out.println(output);
        }

        System.out.println(setOne[2]);

        for(int i=0;i<setOne.length;i++){

            System.out.println(setOne[i]);
        }

        for(String y:s){
            System.out.println(y);
        }
        //hasNext()
        for (int ouptput:setOne){
            System.out.println(ouptput);
        }

        // 0 < 4
        //1 <4
        //2 <4
        //3<4
        //4<4
    }
}
