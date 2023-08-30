package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

// MATERI CONTRAVARIANT
public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Eko");

        objectMyData.setData(1000); // Aman ketika setData(int), namun ... (1)

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());

    }

    public static void process(MyData<? super String> myData){
//        String value = (String) myData.getData(); // Tidak aman ketika kalo data di konversi ke String / selain int ... (2)
        Object value = myData.getData(); // Cara lebih aman untuk getData() adalah menggunakan tipe data Object
        System.out.println("Process parameter " + value);

        myData.setData("Eko"); // Aman untuk setData()
    }
}
