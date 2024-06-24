public class Swapnumber
{

public static void main(String [] args){

    int a= 10;
    int b= 20;

    int c=a;
        a=b;
        b=c;

    System.out.println(" a is "+a+" b is "+b);

    a=a+b;
    b=a-b;
    a=a-b;

    System.out.println(" a is "+a+" b is "+b);

    a=a*b;
    b=a/b;
    a=a/b;

    System.out.println(" a is "+a+" b is "+b);

}

}
