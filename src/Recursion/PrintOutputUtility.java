package Recursion;

import java.util.List;

public class PrintOutputUtility {

    public  static void printSubsequenceOutput(List<Integer> output){
            StringBuilder str = new StringBuilder();
            str.append("[");
            for (int i =0;i<output.size();i++){
                str.append(output.get(i));
                str.append(",");
            }
            if(!str.isEmpty()){
                str.deleteCharAt(str.length()-1);
            }
            str.append("]");
            System.out.print(str.toString());

    }
}
