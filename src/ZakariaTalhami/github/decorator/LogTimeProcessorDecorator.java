package ZakariaTalhami.github.decorator;

public class LogTimeProcessorDecorator extends BaseProcessorDecorator {
    public LogTimeProcessorDecorator() { }

    public LogTimeProcessorDecorator(IDataProcessor dataProcessor) {
        super(dataProcessor);
    }

    @Override
    public void process(int[] data) {
        long startTime = System.nanoTime();
        super.process(data);
        long endTime = System.nanoTime();

        System.out.println("Data was processed in " + (endTime - startTime) + " ns");
    }
}
