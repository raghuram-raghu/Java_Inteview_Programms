import java.util.HashMap;
import java.util.Map;
public class OccuranceOfCharecter {

    public static void main(String []argus){
        String str = " Venkata Sevitha Dheya Royal";
        char[] c= str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char cc:c){
            if(map.containsKey(cc)){
                map.put(cc,map.get(cc)+1);
            } else{
                map.put(cc,1);
            }
        }
        System.out.println(map);
    }
}
