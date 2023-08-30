package programmer.zaman.now.generic.application;

import java.util.Arrays;
import java.util.Comparator;

// MATERI COMPARATOR INTERFACE
public class ComparatorApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Eko", "Indonesia"),
                new Person("Budi", "Indonesia"),
                new Person("Joko", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));

    }
}
