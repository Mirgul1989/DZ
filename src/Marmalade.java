public class Marmalade extends Sweets {

    private String varieties;

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }


    public Marmalade(String taste, String colors, String varieties) {
        super(taste, colors);
        this.varieties = varieties;
    }

    @Override
    public void print() {
        System.out.println("Информация про мармелад" + getTaste() + getColors() + varieties);
    }
}
