package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequenceWithSumK {


    public void printSubsequenceWithSumK(List<Integer> input,List<Integer> output,int index, int sum ,int k ,  int n){

        if(n == index){
            if( sum == k ){
                //print the output
                printOutput(output);
            }
            return;
        }

        output.add(input.get(index));
        sum =sum +input.get(index);
        printSubsequenceWithSumK(input,output,index+1,sum,k ,n);
        sum = sum - output.remove(output.size()-1);
        printSubsequenceWithSumK(input,output,index+1, sum, k ,n);
    }

    private void printOutput(List<Integer> output){
        output.stream().forEach(System.out::print);
        System.out.println("--");
    }
    public static void main(String[] args) {

        PrintSubSequenceWithSumK printSubSequenceWithSumK = new PrintSubSequenceWithSumK();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);
        printSubSequenceWithSumK.printSubsequenceWithSumK(input,new ArrayList<>(),0,0,2,input.size());
    }
}
