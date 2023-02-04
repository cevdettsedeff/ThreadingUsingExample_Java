public class Main {
    public static void main(String[] args) {

        KronometreThread thread_1 = new KronometreThread("thread_1");
        KronometreThread thread_2 = new KronometreThread("thread_2");
        KronometreThread thread_3 = new KronometreThread("thread_3");

        thread_1.start();
        thread_2.start();
        thread_3.start();
    }
}