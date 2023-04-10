package L2;

public class Generic<T> {
    private T value;// можем объявить глобальную переменную

    public Generic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}