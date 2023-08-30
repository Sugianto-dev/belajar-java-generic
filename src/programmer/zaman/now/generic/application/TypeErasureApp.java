package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

// MATERI TYPE ERASURE
public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Eko"); // Type Erasure, Menghilangkan info generic nya

//        MyData<String> myData = new MyData<>("Eko"); // Info generic tidak dihilangkan <String>, Ini lebih aman karena error akan ketahuan saat compile

        MyData<Integer> integerMyData = (MyData<Integer>) myData; // ERROR akan muncul ketika runtime
        Integer integer = integerMyData.getData();

    }
}
