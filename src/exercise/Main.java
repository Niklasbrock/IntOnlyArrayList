package exercise;

public class Main {

    public static void main(String[] args) {
        IntOnlyArrayList intArray = new IntOnlyArrayList();
	    intArray.add(10);
	    intArray.add(20);
        intArray.add(30);
        intArray.add(40);
        intArray.add(50);
        intArray.add(60);
        System.out.println(intArray.toString());
        System.out.println(intArray.size());
        intArray.remove(1);
        System.out.println(intArray.toString());
        System.out.println(intArray.size());
        intArray.clear();
        System.out.println(intArray.toString());
        System.out.println(intArray.size());
        intArray.add(4);
        intArray.add(8);
        intArray.add(15);
        intArray.add(16);
        intArray.add(23);
        intArray.add(42);
        System.out.println(intArray.toString());
        System.out.println(intArray.size());
    }
}
