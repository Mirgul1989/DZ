public class Chocolates extends Sweets{

    private String amount;
    private String name;

    public Chocolates(String taste, String colors,String amount, String name) {
        super(taste, colors);
        this.amount=amount;
        this.name=name;


    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {

        System.out.println( "Информация про шоколад"  + getTaste()+getColors()+name+amount);
}}

