package ZakariaTalhami.github.decorator;

public abstract class BaseProcessorDecorator implements IDataProcessor{
    private IDataProcessor dataProcessor;

    public BaseProcessorDecorator() {
    }

    public BaseProcessorDecorator(IDataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public void setDataProcessor(IDataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    @Override
    public void process(int[] data) {
        if (this.dataProcessor != null) {
            this.dataProcessor.process(data);
        } else {
            System.out.println("Data Processor not defined!");
        }
    }
}
