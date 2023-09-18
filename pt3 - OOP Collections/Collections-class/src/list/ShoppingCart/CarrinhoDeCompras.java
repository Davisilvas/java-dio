/*
 * TODO
 * Atualizar o código pra por a outra aborgem do método exibirItens()
 */


package list.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> cartShopping;
    
    public CarrinhoDeCompras(){
        this.cartShopping = new ArrayList<>();
    }

    public void addItem (String nome, int quant, double preco){
        cartShopping.add(new Item(nome, preco, quant));
    }

    public void removeItem(String nome){
        List<Item> itensToRemove = new ArrayList<>();
        for (Item i : cartShopping){
            if(i.getName().equalsIgnoreCase(nome)){
                itensToRemove.add(i);
            }
        }
        cartShopping.removeAll(itensToRemove);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for (Item i : cartShopping){
            valorTotal += i.getPrice();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println("**************************");
        System.out.println("ITENS PRESENTES NO CARRINHO");

        for (Item i : cartShopping){
            System.out.printf("Nome: %s | Quantidade: %d | Valor Unitário: %.2f%n", i.getName(), i.getQtd(), i.getPrice());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cart = new CarrinhoDeCompras();

        cart.addItem("celular", 1, 1.0);
        cart.addItem("cartao", 1, 2.0);
        cart.addItem("carteira", 1, 3.0);

        double total = cart.calcularValorTotal();
        System.out.println("-----------------------------------------");
        cart.exibirItens();
        System.out.println(total);

        cart.removeItem("carteira");
        cart.exibirItens();

    }
}
