package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class ConsoleCreator implements Creator {
    private String clientName;
    private String product;
    private int qnt;
    private double price;
    private Scanner scanner = new Scanner(System.in);

    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    public void setClientName()
    {
        clientName = prompt("Имя клиента: ");
    };
    public void setProduct()
    {
        product = prompt("Продукт: ");
    };

    public void setQuantity()
    {
        qnt = Integer.parseInt(prompt("Кол-во: "));
    };
    public void setPrice()
    {
        price = Double.parseDouble(prompt("Цена: "));
    };
    public Order getOrder()
    {
        return new Order(clientName, product, qnt, price);
    }
}