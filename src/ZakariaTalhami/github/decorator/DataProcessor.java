package ZakariaTalhami.github.decorator;
import java.util.Random;
import  java.util.concurrent.TimeUnit;
public class DataProcessor implements IDataProcessor{
    Random random = new Random();

    @Override
    public void process(int[] data) {
        try {
            TimeUnit.SECONDS.sleep(random.nextLong() % 20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
