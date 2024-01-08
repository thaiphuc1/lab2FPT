/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
/**
 *
 * @author thaip
 */
public class Algorithm extends inString {
     
     
     public String rsWord(String str){
         List<String> dsWord = new ArrayList<>();
         StringTokenizer strCon = new StringTokenizer(str);
         while(strCon.hasMoreTokens()){
             dsWord.add(strCon.nextToken());
         }
         StringBuilder result = new StringBuilder();
         result.append("{");
         List<Integer> countW = new ArrayList<>();
         for (int i = 0; i < dsWord.size(); i++) {
             if(countW.contains(i)){
                 continue;
             }
             int dem = 1;
             for (int j = i + 1; j < dsWord.size(); j++) {
                 if(dsWord.get(i).equals(dsWord.get(j))){
                     dem ++;
                     countW.add(j);
                 }
             
             }
             result.append(dsWord.get(i) + " = " + dem + ", ");
             System.out.println("");
         }
         
         result.append("}");
         
         return result.toString();
     } 
     
   


     public String rsLetter(String str) {
        Map<Character, Integer> dem = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(str);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(Character.isLetter(ch)){
                dem.put(ch, dem.getOrDefault(ch, 0) + 1);
                }
            }
        }

        
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<Character, Integer> entry : dem.entrySet()) {
            result.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
            
        }
        
        result.append("}");

        return result.toString();
    }

}

     
