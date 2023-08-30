package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Pair;

// MATERI GENERIC CLASS
public class PairApp {

    public static void main(String[] args) {

        // Cara membuat object dari Generic Class (Multiple Parameter Type)
        Pair<String, Integer> pair = new Pair<String, Integer>("eko", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }

}
