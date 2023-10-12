package ArrayandHashing;

import java.util.HashMap;

public class ValidAnagram_Second {
     public boolean isAnagram(String s, String t){
         HashMap<Character,Integer> map= new HashMap<>();
         int sl=s.length();
         int tl=t.length();
         if(sl!=tl){
             return false;
         }
         for(int i=0; i<sl; i++){
             Character sc=s.charAt(i);
             Character tc=t.charAt(i);
             map.put(sc,map.getOrDefault(sc,0)+1);
             map.put(tc, map.getOrDefault(tc, 0)-1);
         }
         for(int value: map.values()){
             if(value!=0){
                 return false;
             }
         }
         return true;
     }
    public static void main(String[] args){
        ValidAnagram_Second object1= new ValidAnagram_Second();
       String s = "anagram", t = "nagaram";
       String s1 = "rat", t1 = "car";
        System.out.println(object1.isAnagram(s,t));
        System.out.println(object1.isAnagram(s1,t1));

    }
}
