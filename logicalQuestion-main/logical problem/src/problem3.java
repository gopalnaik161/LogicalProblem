import java.util.*;
import java.lang.*;
import java.io.*;
class problem3 {
    public int lengthOfLongestSubstring(String s) {
     int a_pointer=0;
     int b_pointer=0;
     int max=0;

 HashSet<Character> x = new HashSet<>();
   while (b_pointer<s.length()){
       if(!x.contains(s.charAt(b_pointer))){
           x.add(s.charAt(b_pointer));
           b_pointer++;
           max =Math.max(x.size(),max);
       }else{
           x.remove(s.charAt(a_pointer));
           a_pointer++;
       }
   }
   return max;

    }

    public static void main(String args[]) {
        problem3 p = new problem3();
        String s = "aaaase";
        System.out.println(p.lengthOfLongestSubstring(s));
    }
}