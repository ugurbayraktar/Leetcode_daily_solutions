public class timer {
    public static void measure(Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
