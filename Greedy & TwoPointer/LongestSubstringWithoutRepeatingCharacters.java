public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
           System.out.println(longestSubstringWithoutRepeatingCharacters("acbcbad"));

    }

    public static int  longestSubstringWithoutRepeatingCharacters(String s){
        int len=0;
        int i=0;
        int j=0;

        while((i<=j) && j<s.length()){
            if(isUnique(s, i, j)){
                len=Math.max(len,(j-i)+1);
            }
            else{
                i++;
            }
            j++;
        }
        return len;

    }
    public static boolean isUnique(String s,int start,int end){
     boolean[] uniqueCheck=new boolean[256];
     for(int i=start;i<=end;i++)
     {
        char c=s.charAt(i);
        if(uniqueCheck[c]) return false;
        uniqueCheck[c]=true;
     }
     return true;
    }
}