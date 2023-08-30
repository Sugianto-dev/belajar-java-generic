package programmer.zaman.now.generic.application;

import java.util.Arrays;

// MATERI COMPARABLE INTERFACE
public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Eko", "Indonesia"),
                new Person("Budi", "Indonesia"),
                new Person("Joko", "Indonesia")
        };

        Arrays.sort(people); // Isinya sebenarnya melakukan Comparable menggunakan method compareTo()
        /*
        * Notes!
        * > Karena sort() menggunakan compareTo(), Maka Person.java wajib implements Comparable agar bisa menggunakan sort() Array Untuk melakukan pengurutan data
        * */

        System.out.println(Arrays.toString(people)); // Wajib override toString() di Person.java

    }
}
