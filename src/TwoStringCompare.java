import java.util.Arrays;

public class TwoStringCompare {


    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "acea";

        char[] st1=str1.toCharArray();
        char[] st2=str2.toCharArray();

        for(int i = 0;i<st1.length;i++){

            if(st1.length!=st2.length){

                System.out.println("not a anagram");

            }
            else{

                Arrays.sort(st1);
                Arrays.sort(st2);
                if(Arrays.equals(st1,st2)==true){

                    System.out.println("both are anagram");

                }else{

                    System.out.println("both are not anagram");
                }



            }

        }
    }

}
