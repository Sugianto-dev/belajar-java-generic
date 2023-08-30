package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.util.ArrayHelper;

// MATERI GENERIC METHOD
public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Eko", "Kurniawan", "Khannedy"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Cara menggunakan Generic Method

        // Cara 1
        // Dengan menyebutkan tipe data array nya pada diamond operator
        System.out.println(
                ArrayHelper.<String>count(names)
        );

        // Cara 2 - Rekomendasi
        // Tidak menyebutkan tipe data array nya pada diamond operator
        // Karena akan otomatis mengikuti tipe data variable nya
        System.out.println(
                ArrayHelper.count(numbers)
        );

    }
}
