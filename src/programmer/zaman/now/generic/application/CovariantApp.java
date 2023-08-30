package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

// MATERI COVARIANT
public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");
        process(stringMyData);

        // Cara 2 Membuat Covariant
        MyData<? extends Object> myData = stringMyData; // Bisa juga seperti ini

    }

    // Cara 1 Membuat Covariant (MyData<? extends Object> myData) pada parameter
    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData()); // Hanya boleh getData(), tidak boleh setData()

//        myData.setData(1); // Tidak boleh, Karena berbahaya
    }
}
