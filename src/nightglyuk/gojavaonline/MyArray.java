package nightglyuk.gojavaonline;

import java.util.Scanner;

/**
 * Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
 Выбрать один из алгоритмов сортировки массивов и реализовать его
 */
public class MyArray implements MyArrayType{
    private int size;
    int[] myArray = new int[100];
    /** инициализация массива */
    public void initArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("input array size in range of 100");
        size=scanner.nextInt();

        for (int i=0;i< size; i++){
            System.out.print("input value of element №" + i);
            myArray[i]= scanner.nextInt();
        }
    }
    /** поиск минимального значения*/
    public int searchMin(){
        int minElem = myArray[0];
        for (int i=1; i<size;i++){
            if (minElem>myArray[i]) {
                minElem=myArray[i];
            }
        }
        return minElem;
    }
    /** поиск максимального значения*/
    public int searchMax(){
        int maxElem = myArray[0];
        for (int i=1; i<size;i++){
            if (maxElem<myArray[i]) {
                maxElem=myArray[i];
            }
        }
        return maxElem;
    }
    /** сортировка по возростанию */
    public void sort(){
        boolean changeDone=true;

        while (changeDone){
            changeDone=false;
            for (int i=0;i<size-1;i++){
                if (myArray[i]>myArray[i+1]){
                    myArray[i]+=myArray[i+1];
                    myArray[i+1]=myArray[i]-myArray[i+1];
                    myArray[i]-=myArray[i+1];
                    changeDone=true;
                }
            }
        }
    }
    /** вывод массива */
    public String outputArray(){
       String outData="";
        outData += "[";
        for (int i=0;i< size;i++){
           if (i<size-1){
               outData+=myArray[i] + ",";
           } else {
               outData+=myArray[i];
           }
        }
        outData += "]";
        return outData;
    }
}
