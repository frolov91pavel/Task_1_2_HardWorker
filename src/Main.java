public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener doneListener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker w = new Worker(doneListener, errorListener);
        w.start();

    }
}
