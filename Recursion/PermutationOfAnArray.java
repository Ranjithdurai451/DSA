import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfAnArray {

    public static void main(String[] args) {
        permutationOfAnArray(new int[]{1,2,3});
    }
    public static void permutationOfAnArray(int arr[]){
      
      
        var result=permutationOfAnArrayHelper(new ArrayList<>(), arr, 0);
         Collections.sort(result,
        (a,b)-> {
            for (int i = 0; i < a.size(); i++) {
                int cmp=Integer.compare(a.get(i), b.get(i));
                if(cmp!=0) return cmp;
            }
            return 0;
        });
        for (List<Integer> list : result) {
            System.out.println(list.toString());
        }
       
    }
    public static List<List<Integer>> permutationOfAnArrayHelper(List<Integer> processed,int[] unprocessed,int index){
        if(index==unprocessed.length){
            List<List<Integer>> result=new ArrayList<>();
            //We connot pass the processed directly because its a reference so it will changed during recursions
            result.add(new ArrayList<>(processed));
            return result;
        }
        
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i <= processed.size(); i++) {
          List<Integer> newProcessed=new ArrayList<>(processed);
          newProcessed.add(i,unprocessed[index]);
          var callResults= permutationOfAnArrayHelper(newProcessed, unprocessed, index+1);
          result.addAll(callResults);  
        }
        return result;
    }
}