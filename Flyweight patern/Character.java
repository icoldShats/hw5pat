public class Character {
    private char symbol;
    private int position;
    private TextStyle style;

    public Character(char symbol, int position, TextStyle style) {
        this.symbol = symbol;
        this.position = position;
        this.style = style;
    }

    public void display() {
        style.applyStyle(symbol, position);
    }
}

