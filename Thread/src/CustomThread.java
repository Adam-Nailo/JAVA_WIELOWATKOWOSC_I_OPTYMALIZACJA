public class CustomThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("CustomThread loop: " + i);
        }
    }
}
