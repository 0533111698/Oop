package oop;

public class Order {
    String product;
    int amount;
    double price;

    public Order(String product,int amount,double price){
        this.product=product;
        this.amount=amount;
        this.price=price;



    }
    public double totalprice(){
        return price*amount;

}
public void printOrder(){
        System.out.print(this.product+" " +this.price+" "+this.amount+"\n"+this.totalprice());


}

}
