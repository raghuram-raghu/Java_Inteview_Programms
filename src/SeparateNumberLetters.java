public class SeparateNumberLetters
{
    public static void main(String []argus){

        String s="s321sd53saaAZzdf13dfs&^GHKJJBHM(*(800980";
        String CaptielLetters ="";
        String SmallLetters   ="";
        String Numbers        ="";
        String Special        ="";

        for (int i = 0; i < s.length(); i++) {
            char c =s.charAt(i);

            if(c>='A' && c<='Z') {

                CaptielLetters = CaptielLetters + c;
            }
            else if (c>='a' && c<='z') {

                SmallLetters =SmallLetters+c;
            }

            else if (c>='0' && c<='9') {

                Numbers =Numbers+c;
            }
            else   {

                Special  =Special +c;
            }
        }

        System.out.println(SmallLetters);
        System.out.println(Numbers);
        System.out.println(Special);
        System.out.println(CaptielLetters);
}


}
