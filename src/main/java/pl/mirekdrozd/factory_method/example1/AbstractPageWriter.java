package pl.mirekdrozd.factory_method.example1;

public abstract class AbstractPageWriter {

    public String pageText() {
        OutputBuilder outputBuilder = new XMLBuilder();
        writeHeaderOn(outputBuilder);
        writeBodyOn(outputBuilder);
        writeFooterOn(outputBuilder);
        return outputBuilder.toString();
    }

    protected abstract void writeHeaderOn(OutputBuilder outputBuilder);
    protected abstract void writeBodyOn(OutputBuilder outputBuilder);
    protected abstract void writeFooterOn(OutputBuilder outputBuilder);
}
