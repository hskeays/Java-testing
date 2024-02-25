import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap
        // Student IDs and money raised
        TreeMap<Integer, Integer> student = new TreeMap<>();
        student.put(9, 30);
        student.put(10, 25);
        student.put(5, 15);
        student.put(12, 10);
        student.put(8, 40);
        //now loop through the map
        student.forEach((key, value) -> System.out.println("Key = " + key
                + " Value = " + value));
        System.out.println();

//        System.out.println(student.firstEntry());
//        System.out.println(student.lastEntry());
//        System.out.println();
//
//        System.out.println(student.floorKey(11));
//        System.out.println(student.floorEntry(11));
//        System.out.println(student.ceilingKey(11));
//        System.out.println(student.ceilingEntry(11));

//        System.out.println(student.lowerKey(12));
//        System.out.println(student.higherKey(12));

        System.out.println(student.subMap(5, 11));

    }
}