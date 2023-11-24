public class Ingredient {

    //De variabelen

    private double amount;

    private String unit;

    private String name;


    //De constructors

    public Ingredient(){
    }

    public Ingredient(double amount,String unit,String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }


    //De getters en de setters van amount, unit en name.

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit(){
        return unit;
    }

    public void setUnit(String newunit){
        this.unit = newunit;
    }

    public String getName(){
        return name;
    }

    public void setName(String setname){
        this.name = setname;
    }


}
