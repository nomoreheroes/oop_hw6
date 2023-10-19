package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        ConsoleCreator cc = new ConsoleCreator();
        JSONWriter jw = new JSONWriter();
        cc.setClientName();
        cc.setProduct();
        cc.setQuantity();
        cc.setPrice();
        Order order = cc.getOrder();
        if(jw.write(order)) System.out.println("Информация по заказу успешно сохранена в файл.");
        else System.out.println("Что-то пошло не так");

    }

}
