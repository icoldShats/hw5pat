public class Main {
    public static void main(String[] args) {
        Character[] document = new Character[6];

        TextStyle titleStyle = TextStyleFactory.getStyle("Arial", 16, true, "black");

        TextStyle normalStyle = TextStyleFactory.getStyle("Times New Roman", 12, false, "gray");

        document[0] = new Character('H', 0, titleStyle);
        document[1] = new Character('e', 1, titleStyle);
        document[2] = new Character('l', 2, titleStyle);
        document[3] = new Character('l', 3, titleStyle);
        document[4] = new Character('o', 4, titleStyle);
        document[5] = new Character('.', 5, normalStyle);

        for (Character c : document) {
            c.display();
        }

        System.out.println("unic style: " + TextStyleFactory.getTotalStyles());
    }
}
//Flyweight паттерн используется, чтобы уменьшить количество объектов
//в системе и сэкономить память. Он полезен, когда у нас есть большое количество
//        одинаковых объектов, но с небольшими отличиями

//В текстовом редакторе у нас может быть миллион символов.
//Каждый символ может быть одним из нескольких вариантов: Arial, 12pt,
//жирный или обычный и т.д. Вместо того, чтобы создавать новый объект
//для каждого символа, мы используем Flyweight. Мы создаём один объект
//стиля и применяем его ко всем одинаковым символам.
//
//Так, например, если в документе 100 символов с одинаковым шрифтом и размером,
//мы храним один стиль и просто ссылаемся на него, вместо того чтобы для каждого
//символа создавать новый объект с теми же данными.
