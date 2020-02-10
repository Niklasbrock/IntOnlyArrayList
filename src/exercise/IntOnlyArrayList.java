package exercise;

import java.util.Arrays;

public class IntOnlyArrayList {

    private int[] intArray;


    public IntOnlyArrayList() {
        intArray = new int[0];
    }

    public int get(int index){
        return intArray[index];
    }

//    Gemmer array i en buffer.
//    Laver et nyt int array med en ekstra plads i forhold til det gamle.
//    Tilfojer de gamle vaerdier fra buffer.
//    Tilfojer den nye.
    public void add(int value){
        int[] intArrayBuffer = intArray;
        intArray = new int[intArrayBuffer.length+1];
        if (intArrayBuffer.length != 0){
            for (int i = 0; i < intArrayBuffer.length; i++){
                intArray[i] = intArrayBuffer[i];
            }
            intArray[size()-1] = value;
        } else{
            intArray[0] = value;
        }
    }

//    Saetter index i array lig med value parameteren.
    public void add(int index, int value){
            intArray[index] = value;
    }
//    Gemmer array i en buffer.
//    Laver et nyt array med en mindre plads i forhold til det gamle.
//    Tilfojer de vaerdier som er mindre end index parameteren.
//    Tilfojer de vaerdier som er storre end index parameteren
//      ved at starte for loop fra index og tilfoje fra buffer + 1
    public void remove(int index){
        int[] intArrayBuffer = intArray;
        intArray = new int[intArrayBuffer.length-1];
        if (intArrayBuffer.length != 0){
            for (int i = 0; i < index; i++){
                intArray[i] = intArrayBuffer[i];
            }
            for (int i = index; i < intArray.length; i++){
                intArray[i] = intArrayBuffer[i+1];
            }
        }
    }
    public int size(){
        return intArray.length;
    }
//    Laver et nyt object, og saetter storrelsen til 0
    public void clear(){
        intArray = new int[0];
    }

    @Override
    public String toString() {
        return "IntOnlyArrayList{" +
                "intArray=" + Arrays.toString(intArray) +
                '}';
    }
}
