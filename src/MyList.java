public interface MyList<T> {
    void add(T value);

    void add(int index, T value);

    void set(int index, T value);

    T get(int index);

    void remove(int index);

    boolean contains(T value);

    int size();
}
