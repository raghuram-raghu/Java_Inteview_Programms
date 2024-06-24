public class AddTwoString {


    public static void main(String[] args) {
        String s1 = "asdfghjklzxcvbnmpoiuytrewq";
        String s2 = "00000000000000000000000000";
        String s3 = "";
        String s4 = "";

        for (int i = 0; i < s1.length() - 2; i++) {
            s3 = s3 + s1.charAt(i) + s1.charAt(i + 1) + s2.charAt(i) + s2.charAt(i + 1);
            i++;
        }
        System.out.println(s3);


        for (int i = 0; i < s1.length(); i++) {
            s4 = s4 + s1.charAt(i) + s2.charAt(i) ;

        }
        System.out.println(s4);
    }
}
