package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

// MATERI GENERIC CLASS
public class GenericClassApp {

    public static void main(String[] args) {

        // Cara membuat object dari generic class
        /*
        * Notes!
        * > Tipe data yang digunakan hanya bisa object
        *   > <int> tidak bisa, <Integer> bisa
        * */
        MyData<String> stringMyData = new MyData<String>("Eko");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        // Cara memanggil data
//        String stringValue = (String) stringMyData.getData(); // Tidak perlu lagi melakukan konversi tipe data
        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        // Cara menampilkan data
        System.out.println(stringValue);
        System.out.println(integerValue);

    }

}
