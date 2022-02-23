public class Demo {

    public <T> void run(T[] array, int shift) {
        int start = 0, pos = start + shift;
        T valInsert = array[start];
        for (int i = 0; i < array.length; i++) {
            T valSave = array[pos];
            array[pos] = valInsert;
            if (pos != start) {
                valInsert = valSave;
                pos = (pos + shift) % array.length;
            } else {
                start++;
                valInsert = array[start];
                pos = start + shift;
            }
        }
    }
}
