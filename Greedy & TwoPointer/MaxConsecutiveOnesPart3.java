
public class MaxConsecutiveOnesPart3 {

    public static void main(String[] args) {

        System.out.println(maxConsecutiveOnesPart3(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        
    }
    public static int maxConsecutiveOnesPart3(int[] arr,int t){
     int maxLen=0;
    int i=0;
    int j=0;
    int zerosCount=0;
    while(j<arr.length){
        if(arr[j]==0) zerosCount++;
        while(zerosCount>t){
            if(arr[i]==0) zerosCount--;
            i++;
        }
        maxLen=Math.max(maxLen, (j-i+1));
        j++;
    }
   return maxLen;
    
    }

}
