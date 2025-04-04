public class TextStyle {
    private String font;
    private int size;
    private boolean bold;
    private String color;

    public TextStyle(String font, int size, boolean bold, String color) {
        this.font = font;
        this.size = size;
        this.bold = bold;
        this.color = color;
    }

    public void applyStyle(char character, int position) {
        System.out.println("Символ '" + character + "' на позиции " + position +
                " — стиль: " + font + ", " + size + "pt, bold=" + bold + ", цвет: " + color);
    }
}
