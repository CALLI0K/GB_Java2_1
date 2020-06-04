package HW5;

public class ThreadLines extends Thread{
    public float[] arr;

    public ThreadLines(float[] arr) {
        this.arr = arr;
    }
@Override
    public void run() {
    System.out.println("этот медод работает");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
