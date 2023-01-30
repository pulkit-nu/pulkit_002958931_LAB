/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pulkit
 */
public class ArrayClass {
    
    private static void printArray(int[] testArray){
        for (int i =0; i<testArray.length; i++)
            System.out.print(testArray[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] argv){
    int [] testArray = {1,2,3,4,5,6,7,8,9,10};
    printArray(testArray);
    for (int i = 0; i < 10; i++){
        if (i%2 == 0)
            testArray[i] *= 2;
        else
            testArray[i] *= 3;}
    printArray(testArray);
//    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//    System.out.println(arrayList);
//    for (int i = 0; i < arrayList.size(); i++){
//        if (i%2 == 0)
//            arrayList.set(i, arrayList.get(i)*2);
//        else
//            arrayList.set(i, arrayList.get(i)*3);}
//    System.out.println(arrayList);
    }
    
}
