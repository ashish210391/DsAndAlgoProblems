package Recursion;

import java.util.Arrays;

public class ReverseArray {


    public void revArrayTwoPointer(int ar[], int left, int right){

        if(left>=right)return;
        swap(ar,left,right);
        revArrayTwoPointer(ar,left+1,right-1);
    }

    public void revArraySinglePointer(int ar[],int index){
        if(index>=ar.length/2){
            return;
        }
        swap(ar,index,ar.length-index-1);
        revArraySinglePointer(ar,index+1);
    }

    private void swap(int ar[], int start,int end ){
        int temp = ar[start];
        ar[start]=ar[end];
        ar[end]=temp;

    }
    public static void main(String[] args) {

        ReverseArray reverseArray= new ReverseArray();
        int ar[]={1,2,3,4,5};

        reverseArray.revArrayTwoPointer(ar,0,ar.length-1);
        Arrays.stream(ar).forEach(e-> System.out.println(e));
        reverseArray.revArraySinglePointer(ar,0);
        Arrays.stream(ar).forEach(e-> System.out.println(e));

    }
}
