package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAnyOneSubsequenceWithSumK {
    public void printAnyOneSubSequenceSumK(List<Integer> input, List<Integer> output, int index , int sum, int k,int n){
        if(index >=n){
            if( sum == k){
                //print output
                PrintOutputUtility.printSubsequenceOutput(output);
            }
            return;
        }
        int item = input.get(index);
        output.add(item);
        sum = sum+item;
        printAnyOneSubSequenceSumK(input,output,index+1, sum , k , n);
        item = output.remove(output.size()-1);
        sum= sum -item;
        printAnyOneSubSequenceSumK(input,output,index+1, sum , k , n);

    }

    public static void main(String[] args) {

        PrintAnyOneSubsequenceWithSumK printAnyOneSubsequenceWithSumK = new PrintAnyOneSubsequenceWithSumK();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);

        printAnyOneSubsequenceWithSumK.printAnyOneSubSequenceSumK(input,new ArrayList<>(),0,0,2,input.size());
    }

}
