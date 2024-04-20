package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequenceWithSumK {


    public int countSubsequenceWithSumK(List<Integer> input, List<Integer> output, int index, int sum, int k , int n ){

        if(index >= n){
            if(sum == k ){
                return 1;
            }
            return  0;
        }
         int item = input.get(index);
         output.add(item);
         sum = sum+item;
         int left = countSubsequenceWithSumK(input,output,index+1,sum, k,n);
         item = output.remove(output.size()-1);
         sum = sum-item;
         int right = countSubsequenceWithSumK(input,output,index+1,sum,k,n);

         return left+right;
    }

    public static void main(String[] args) {

        CountSubsequenceWithSumK count = new CountSubsequenceWithSumK();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);
        int totalCountOfSubsequence = count.countSubsequenceWithSumK(input, new ArrayList<>(), 0, 0, 0, input.size());
        System.out.println("Total number of subsequence  with sum k = "+totalCountOfSubsequence);

    }
}
