package youtube;

public class MultipleThread {

    private final int THREAD_ID;

    public MultipleThread(int id) {
        this.THREAD_ID = id;
    }

    public void multiThread() {

        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; ++i) {
                System.out.println("Thread " + THREAD_ID + ": " + i);

                try {
                    Thread.sleep(1000);
                } catch (Exception ignored) {

                }
            }
        });

        thread.start();
    }
}
