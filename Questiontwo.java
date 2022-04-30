import java.util.ArrayList;
import java.util.HashMap;

public class Questiontwo {

    private String getSortedString(String s){
        int [] alphabets = new int[26];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            alphabets[c-'a']++;
        }
        StringBuilder temp = new StringBuilder();

        for(int i=0;i<26;i++){
            if(alphabets[i]==0)continue;
            else{
                while(alphabets[i]>0){

                    temp.append((char)(i+'a'));
                    alphabets[i]--;
                }
            }
        }
        return temp.toString();
    }

    public ArrayList<ArrayList<String>> getSolutionOfQuestionTwo(ArrayList<String> list){

        HashMap<String, ArrayList<String>> map = new HashMap<>();

      
        //sort each string to form a base string. use that base string to check if an anagram is present in the map or not
        for(String str: list){
            String baseString = getSortedString(str);
            if(map.containsKey(baseString)){
                ArrayList<String> listOfBaseString = map.get(baseString);
                listOfBaseString.add(str);
            }
            else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(baseString, temp);
            }
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        for(String key: map.keySet()){

            ArrayList<String> temp = map.get(key);
            ans.add(temp);

        }
        return ans;

    }
}
