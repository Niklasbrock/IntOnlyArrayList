package exercise;

import java.util.Arrays;

public class GenArrayList<E> {

    private Object[] objects;

    public GenArrayList() {
        objects = new Object[0];
    }

    public Object get(int index){
        return objects[index];
    }

    //    Gemmer array i en buffer.
    //    Laver et nyt int array med en ekstra plads i forhold til det gamle.
    //    Tilfojer de gamle vaerdier fra buffer.
    //    Tilfojer den nye.
    public void add(E value){
        Object[] objectsBuffer = objects;
        objects = new Object[objectsBuffer.length+1];
        if (objectsBuffer.length != 0){ //ellers giver den out of bounds ved size()-1
            for (int i = 0; i < objectsBuffer.length; i++){
                objects[i] = objectsBuffer[i];
            }
            objects[size()-1] = value;
        } else{
            objects[0] = value;
        }
    }

    //    Saetter index i array lig med value parameteren.
    public void add(int index, E value){
        objects[index] = value;
    }
    //    Gemmer array i en buffer.
    //    Laver et nyt array med en mindre plads i forhold til det gamle.
    //    Tilfojer de vaerdier som er mindre end index parameteren.
    //    Tilfojer de vaerdier som er storre end index parameteren
    //      ved at starte for loop fra index og tilfoje fra buffer + 1
    public void remove(int index){
        Object[] objectsBuffer = objects;
        objects = new Object[objectsBuffer.length-1];
        if (objectsBuffer.length != 0){
            for (int i = 0; i < index; i++){
                objects[i] = objectsBuffer[i];
            }
            for (int i = index; i < objects.length; i++){
                objects[i] = objectsBuffer[i+1];
            }
        }
    }
    public int size(){
        return objects.length;
    }
    //    Laver et nyt object, og saetter storrelsen til 0
    public void clear(){
        objects = new Object[0];
    }

    @Override
    public String toString() {
        return "IntOnlyArrayList{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
