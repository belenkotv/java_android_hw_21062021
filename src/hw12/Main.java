package hw12;

public class Main {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        task1(args);
        task2(args);
    }

    public static void task1(String[] args) {

        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        modifyArray(arr, 0, SIZE, 0);
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[HALF]);

    }

    public static void task2(String[] args) {

        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                modifyArray(a1, 0, HALF, 0);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                modifyArray(a2, 0, HALF, HALF);
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[HALF]);

    }

    static void modifyArray(float[] array, int offset, int length, int adjust) {
        for (int i = offset; i < offset + length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + (i + adjust) / 5) *
                    Math.cos(0.2f + (i + adjust) / 5) * Math.cos(0.4f + (i + adjust) / 2));
        }
        System.out.println(length + " operations");
    }


}
