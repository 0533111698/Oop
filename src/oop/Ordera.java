package oop;

public class Ordera {
    String product;
    int amount;
    double price;

    public Ordera(String product,int amount,double price){
        this.product=product;
        this.amount=amount;
        this.price=price;
    }

    public double totalprice(){
        return price*amount;

    }

    public void printordera(){
        System.out.println("product: "+this.product+" amont: "+this.amount+" price: "+this.price);
        System.out.println("total price"+amount*price);
    }
}
