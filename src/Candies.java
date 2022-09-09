public class Candies extends Sweets {
    private String name;
    private int theWeight;


    public Candies(String taste, String colors,String name, int theWeight) {
        super(taste, colors);
        this.name=name;
        this.theWeight=theWeight;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheWeight() {
        return theWeight;
    }

    public void setTheWeight(int theWeight) {
        this.theWeight = theWeight;
    }

    @Override
    public void print() {

            System.out.println( "Информация про конфет" + name+theWeight + getTaste()+getColors());

    }
}
