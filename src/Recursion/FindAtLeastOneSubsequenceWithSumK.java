package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAtLeastOneSubsequenceWithSumK {

    public boolean findAtLeastSubsequenceWithSumK(List<Integer> input , List<Integer> output, int index, int sum , int k , int n ){

        if(index >= n){
            if( sum == k ){
                PrintOutputUtility.printSubsequenceOutput(output);
                return true;
            }
            return false;
        }

        int item = input.get(index);
        output.add(item);
        sum=sum+item;

        if (findAtLeastSubsequenceWithSumK(input, output, index + 1, sum, k, n)) {
            return true;
        }
        item = output.remove(output.size() - 1);
        sum = sum - item;

        if (findAtLeastSubsequenceWithSumK(input, output, index + 1, sum, k, n)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        FindAtLeastOneSubsequenceWithSumK findSubsequence = new FindAtLeastOneSubsequenceWithSumK();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);

        findSubsequence.findAtLeastSubsequenceWithSumK(input,new ArrayList<>(),0,0,2,input.size());

    }
}
