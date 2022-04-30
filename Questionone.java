import java.util.ArrayList;
import java.util.HashMap;

public class Questionone {


    private int getSum(int n){
        int ans =0;
        for(int i=n;n>=0;n--)ans+=n;
        return ans;
    }

    public int getSolutionOfQuestionOne(int [] arr){

        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        //use hashmap to keep a count of freq of a particular color
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        //iterate hashmap
        int ans =0;

        for(int key: map.keySet()){
            int freq = map.get(key);
            ans += getSum(freq-1);
            // if [1,1,1] the pairs will be of indexes (0,1), (0,2), (1,2)
        }
        return ans;
    }
}
