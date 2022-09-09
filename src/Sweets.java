public abstract class Sweets implements Printable {
    private String taste;
    private String colors;

    public Sweets(String taste, String colors) {
        this.taste = taste;
        this.colors = colors;
    }

    public String getTaste() {
        return taste;
    }

    public String getColors() {
        return colors;
    }
}

