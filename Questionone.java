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
        }
        return ans;
    }
}
