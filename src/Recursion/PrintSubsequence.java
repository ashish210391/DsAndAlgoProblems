package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {


    public void printSubsequence(List<Integer> input , List<Integer> output,int index, int n ){
        if( index >= n){
            printOutput(output);
            return ;
        }
        output.add(input.get(index));
        printSubsequence(input,output,index+1,n);
        output.remove(output.size()-1);
        printSubsequence(input,output,index+1,n);
    }

    private void printOutput(List<Integer> output){
        output.stream().forEach(System.out::print);
        System.out.println("--");
    }
    public static void main(String[] args) {

        PrintSubsequence  printSubsequence = new PrintSubsequence();
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(2);
        input.add(1);
        printSubsequence.printSubsequence(input,new ArrayList<>(),0,input.size());
    }
}
