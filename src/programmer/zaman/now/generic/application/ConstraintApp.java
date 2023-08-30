package programmer.zaman.now.generic.application;

// MATERI BOUNDED TYPE PARAMETER
public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);

//        NumberData<String> stringNumberData = new NumberData<String>("Eko"); // ERROR, Karena NumberData extends Number, wajib turunan Number
    }

    public static class NumberData<T extends Number>{ // Default nya Object, jika tidak diberi extends

        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;

//            this.data.doubleValue() // Karena extends Number, semua method yang ada di Number bisa diakses
        }
    }
}
