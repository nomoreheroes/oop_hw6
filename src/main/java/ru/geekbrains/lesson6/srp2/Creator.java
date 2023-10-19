package ru.geekbrains.lesson6.srp2;

public interface Creator {
    public void setClientName();
    public void setProduct();
    public void setQuantity();
    public void setPrice();
    public Order getOrder();
}