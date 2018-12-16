package commandPattern;

public class CopyCommand implements Command {
    Document document;

    public CopyCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.copy();
    }
}
