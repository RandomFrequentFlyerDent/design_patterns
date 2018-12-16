package commandPattern;

public class Menu {
    Button[] buttons;

    public Menu() {
        this.buttons = new Button[3];
    }

    public void setButton(int number, Button button) {
        buttons[number] = button;
    }

    public void pressButton(int number) {
        buttons[number].press();
    }
}
