package ZakariaTalhami.github.decorator;

public class Main {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();
        LogTimeProcessorDecorator logTimeProcessorDecorator = new LogTimeProcessorDecorator(dataProcessor);

        logTimeProcessorDecorator.process(new int[]{});
        logTimeProcessorDecorator.process(new int[]{});
        logTimeProcessorDecorator.process(new int[]{});
    }
}
