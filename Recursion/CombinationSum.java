import java.util.*; 
public class CombinationSum {
  public static void main(String args[]) {
   var ans=new ArrayList<Integer>();
    CombinationSum(ans,new int[]{1,2,1},0,3);


 }
  public static void CombinationSum(ArrayList<Integer> processed,int[] unprocessed,int index,int target) {
   if(target==0){
     System.out.println(processed.toString());
     return;
   }
   if(target<0||index==unprocessed.length){
     return;
   }
   processed.add(unprocessed[index]);
   CombinationSum(processed,unprocessed,index+1,target-unprocessed[index]);
   processed.remove(processed.size()-1);
  CombinationSum(processed,unprocessed,index+1,target); 
    
  }
}
