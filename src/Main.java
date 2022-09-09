public class Main {
    public static void main(String[] args) {

        String[] sweets = {"marmelade", "candies", "chocolate"};

        for (String sweet : sweets) {
            Printable item = createObject(sweet);
            item.print();
        }
    }

    public static Printable createObject(String className) {
        Sweets sweets = null;
        switch (className) {
            case "marmelade" -> {
                sweets = new Marmalade("Желейный ", "Красный", "Жевательный");
            }
            case "candies" -> {
                sweets = new Candies("Сладкий ", "Оранжевый", "Merci", 100);
            }
            case "chocolate" -> {
                sweets = new Chocolates("Темный ", "Черный", "Много", "Горький");
            }
        }
        return sweets;
    }
}



