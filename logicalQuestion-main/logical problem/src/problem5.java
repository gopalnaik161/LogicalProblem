
import java.util.*;

public class problem5
{
    public String longestCommonPrefix(String[] str)
    {
     if (str.length==0) return "";
     String prefix = str [0];
     for(int i=1; i<str.length;i++){
         while(str[i].indexOf(prefix)!=0){
             prefix=prefix.substring(0,prefix.length()-1);
         }
     }
     return prefix;
    }
    public static void main(String[] args)
    {
        problem5 p = new problem5();
        String[] str = {"gopalnaik", "gopalkrishna", "gopu"};
        System.out.println(p.longestCommonPrefix(str));
    }
}

