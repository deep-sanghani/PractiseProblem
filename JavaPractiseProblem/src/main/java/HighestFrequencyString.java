import java.util.HashMap;

public class HighestFrequencyString {
    static String findhighestfreq(String s){
        String[]arr=s.split(" ");
        HashMap<String,Integer> mp=new HashMap<>();
        for(String val:arr){
            mp.put(val,mp.get(val)==null?1:mp.get(val)+1);
        }
        int max=0;
        for(String val:arr){
            if(mp.get(val)>max){
                max=mp.get(val);
            }
        }
        String str="";
         for(String val:arr){
            if(mp.get(val)==max){
                str=val;
                break;
            }
        }
        return str+" "+max;
    }

    public static void main(String[] args) {
        String S = "this is not right";
        String ans = findhighestfreq(S);
        System.out.println(ans);
    }
}
