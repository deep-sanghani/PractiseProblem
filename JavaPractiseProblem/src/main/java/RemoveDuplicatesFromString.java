import java.util.HashMap;

public class RemoveDuplicatesFromString {
    static String Removeduplicate(String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(!mp.containsKey(s.charAt(i))){
                ans += s.charAt(i);
                mp.put(s.charAt(i),1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = "gfg";
        String ans = Removeduplicate(S);
        System.out.println(ans);
    }
}
