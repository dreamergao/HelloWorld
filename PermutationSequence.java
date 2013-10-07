import java.util.ArrayList;


public class PermutationSequence {

	public String getPermutation(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuilder result = new StringBuilder();
        int temp1;
        int digit;
        int temp2;
        ArrayList<Integer> rec = new ArrayList<Integer>();
        for(int i = 0; i<n; i++){
            rec.add(i+1);
        }
        for(int i = n; i>1; i--){
            temp2 = helper(i-1);
            temp1 = (k-1)/temp2;
            digit = rec.get(temp1);
            rec.remove(temp1);
            result.insert(n-i, digit);
            k = k - temp1*temp2;
        }
        result.insert(n-1, rec.get(0));
        return result.toString();  
    }
    
    int helper(int n){
        if(n==0)
            return 1;
        int result = 1;
        while(n>0){
            result*=n;
            n--;
        }
        return result;
    }
}
