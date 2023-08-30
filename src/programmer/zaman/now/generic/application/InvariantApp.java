package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

// MATERI INVARIANT
public class InvariantApp {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Polymorphisme & Inheritance tidak ada hubungan nya dengan Generic
        *
        * > Jika sudah di set <String> maka hanya bisa dikirim ke parameter yang nerima <String> lagi, tidak bisa ke <Object>, dll
        * > Begitupun sebaliknya
        * */

        MyData<String> stringMyData = new MyData<>("Eko"); // Cukup <>, tidak perlu <String>
//        doIt(stringMyData); // ERROR
//        MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>(1000); // Cukup <>, tidak perlu <Object>
//        MyData<Integer> integerMyData = objectMyData; // ERROR
//        doItInteger(objectMyData); // ERROR
    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData) {
        // do nothing
    }
}
