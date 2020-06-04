package HW5;

public class ThreadTest {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        Test(arr);
        System.out.print("Время первой функции =");
        System.out.println(System.currentTimeMillis() - a);

        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long b = System.currentTimeMillis();
        ThreadLines Tl1=new ThreadLines(a1);
        ThreadLines Tl2=new ThreadLines(a2);
        Tl1.start();
        Tl2.start();
        try {
            Tl1.join();
            Tl2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.print("Время второй функции =");
        System.out.println(System.currentTimeMillis() - b);
    }

    public static void Test(float[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }
}
