public class ArrayProgram1 {


    public static int[] Arraysum(int[]arr, int num){

        int [] newarr =new int [2];

                for(int i=0;i<arr.length-1;i++){

                    for(int j=i+1;j<arr.length-1;j++){
                        int total =arr[i]+arr[j];
                        newarr[0]= arr[i];
                        newarr[1]=arr[j];
                        if(total==num){
                            System.out.println(arr[i]+"fjsns"+arr[j]);
                            break;
                        }
                    }
                }
       return newarr ;
    }

    public static void main (String []args){

        int[] earr={1,2,3,5,5,4,6,6};
        int resultnum = 10;
       int[] narr = Arraysum(earr,resultnum);

       for(int i=0;i<narr.length;i++){

           System.out.println(narr[i]);
       }
    }
}
