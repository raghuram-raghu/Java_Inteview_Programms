import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitCategoryArray {

    public static void main(String[] args) {


        String[] arr = {"Rahul Cricket", "Sachin Cricket", "Messy football"};

        Map<String,List<String>> map = new HashMap();

        for(String arrlist:arr){

            String[]parts=arrlist.split(" ");

            String name = parts[0];
            String sports = parts[1];

            if(map.containsKey(sports)){

                map.get(sports).add(name);

            }else{

                List<String> names = new ArrayList<>();

                names.add(name);
                map.put(sports,names);
            }

        }

        System.out.println(map);

    }
}
