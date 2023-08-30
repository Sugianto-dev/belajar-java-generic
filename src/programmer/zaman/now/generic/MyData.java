package programmer.zaman.now.generic;

// MATERI GENERIC CLASS
public class MyData<T> { // Diamond operator (<T>) menandakan jika ini Generic Class

    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
