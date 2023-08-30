package programmer.zaman.now.generic.util;

// MATERI GENERIC METHOD
public class ArrayHelper {

    public static <T> int count(T[] array) { // Tidak harus static
        return array.length;
    }

}
