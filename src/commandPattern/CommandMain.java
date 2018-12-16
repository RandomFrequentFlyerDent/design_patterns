package commandPattern;

public class CommandMain {
    public static void main(String[] args) {
        Document document = new Document();
        Menu menu = new Menu();
        menu.setButton(0, new Button(new SaveCommand(document)));
        menu.setButton(1, new Button(new CopyCommand(document)));
        menu.setButton(2, new Button(new PasteCommand(document)));

        menu.pressButton(1);
        menu.pressButton(0);
        menu.pressButton(2);
    }
}
