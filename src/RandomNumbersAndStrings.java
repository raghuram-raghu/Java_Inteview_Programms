import java.util.Random;

public class RandomNumbersAndStrings {

    public static void main(String []args){


        Random random = new Random();

        int rnum = random.nextInt(10);
        System.out.println(rnum);

        System.out.println(Math.random());





        String str = "zxcvbnmlkjhgfdsaqwertyuiop0123654789";

        StringBuilder sb = new StringBuilder();

        int length=10;
        for(int i=0;i<length;i++){

            int strnum = random.nextInt(str.length());
            char randomchar=str.charAt(strnum);
            sb.append(randomchar);
        }

        String randomstring=sb.toString();

        System.out.println(randomstring);

    }
}
