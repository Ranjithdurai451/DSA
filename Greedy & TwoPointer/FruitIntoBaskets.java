import java.util.stream.Collectors;
import java.util.*;
public class FruitIntoBaskets {
  
    public static void main(String[] args) {
    Integer[] nums=new Integer[]{1,2,3,4};
    nums=(Integer[])Arrays.stream(nums).sorted(Comparator.reverseOrder()).toArray();
    System.out.println(Arrays.toString(nums));
    Map<String,Character> hash=new HashMap<>();

    hash.put("ranjith", 'A');
    hash.put("kumar", 'C'); 
    hash.put("me", 'B');
    hash = hash.entrySet().stream()
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (e1, e2) -> e1,                  // merge function
        LinkedHashMap::new              // keeps sorted order
    ));

    hash.forEach((a,b)-> System.out.println(a+" "+b));
    };
    public static int fruitIntoBaskets(int[] fruits){
    int maxCount=0;
    var hash=new HashMap<Integer,Integer>();
    int i=0;
    int j=0;
    while(j<fruits.length){

        if(hash.size()>2){
            if(hash.get(fruits[i])==1) hash.remove( fruits[i]);
            else hash.put(fruits[i],hash.get(fruits[i])-1);
            i++;
        }
        hash.put(fruits[j],hash.getOrDefault(fruits[j], 0)+1 );
        maxCount=Math.max(maxCount,(j-i+1));
        j++;
    }
    return maxCount;
    }
}