package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

// MATERI WILDCARD
public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(100));
        print(new MyData<String>("Eko"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData){ // T diganti ? untuk Wildcard, Artinya tidak peduli tipe data apapun bisa di input
        System.out.println(myData.getData());
        /*
        * Notes!
        * > Jangan sesekali konversi ke tipe data
        * > Karena kita tidak tau tipe data apa yang di input ke dalam myData
        * */
    }
}
