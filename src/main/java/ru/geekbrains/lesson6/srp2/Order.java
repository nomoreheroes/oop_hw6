package ru.geekbrains.lesson6.srp2;



public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private double price;

    public Order(){

    }

    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    /**
     * @return String return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @return String return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @return int return the qnt
     */
    public int getQnt() {
        return qnt;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

}
