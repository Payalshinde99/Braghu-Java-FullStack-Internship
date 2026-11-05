
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintTask implements Runnable {

    private int taskNumber;

    PrintTask(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {

        System.out.println(
            "Task " + taskNumber
            + " executed by "
            + Thread.currentThread().getName()
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Task interrupted.");
        }
    }
}

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {

            executor.execute(new PrintTask(i));
        }

        executor.shutdown();

        System.out.println("All tasks submitted.");
    }
}
