package list.ShoppingCart;

public class Item {
    private String name;
    private double price;
    private int qtd;

    public Item (String name, double price, int qtd){
        this.name = name;
        this.qtd = qtd;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtd() {
        return qtd;
    }

    
}