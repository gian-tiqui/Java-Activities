
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String string = i + "%";

            System.out.println(string);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("meow");
    }
}