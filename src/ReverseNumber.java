public class ReverseNumber {

    public static void main (String [] args){

        int number =789632145;
        int temp=0;

        while (number!=0){

            int rem =number%10;

            temp=temp*10+rem;

            number=number/10;

        }

        System.out.println(temp);
        System.out.println(number);
    }
}
