package exercise;

public class Main {

    public static void main(String[] args) {
        IntOnlyArrayList intArray = new IntOnlyArrayList();
        System.out.printf("\n%s\n","Tilføjer 6 int værdier til array, kalder toString og size");
	    intArray.add(10);
	    intArray.add(20);
        intArray.add(30);
        intArray.add(40);
        intArray.add(50);
        intArray.add(60);
        System.out.println(intArray.toString());
        System.out.println(intArray.size());

        System.out.printf("\n\n%s\n","Fjerner index 1, kalder toString og size");
        intArray.remove(1);
        System.out.println(intArray.toString());
        System.out.println(intArray.size());

        System.out.printf("\n\n%s\n","Tilføjer int værdi 400 ved index 2 i array, kalder toString og size");
        intArray.add(2, 400);
        System.out.println(intArray.toString());
        System.out.println(intArray.size());

        System.out.printf("\n\n%s\n","Kalder clear metoden, kalder toString og size");
        intArray.clear();
        System.out.println(intArray.toString());
        System.out.println(intArray.size());

        System.out.printf("\n\n%s\n","Tilføjer igen 6 int værdier til array, kalder toString og size");
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
