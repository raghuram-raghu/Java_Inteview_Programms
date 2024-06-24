import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

    public static void main(String []argus){

        String str ="asdfghjklpoiuytrewqasdfghjkl";
        char[]c=str.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for (char cc:c){

            if(map.containsKey(cc)){

                map.put(cc,map.get(cc)+1);

            }
            else{

                map.put(cc,1);
            }

        }
        System.out.println(map);
        }
    }

