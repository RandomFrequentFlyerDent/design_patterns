package commandPattern;

public class PasteCommand implements Command {
    Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.paste();
    }
}
