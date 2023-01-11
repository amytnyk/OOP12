package org.example.task1;

public class ATM {
    public static void main(String[] args) {
        Handler handler5 = HandlerFactory.FIVE.build();
        Handler handler20 = HandlerFactory.TWENTY.build();
        Handler handler50 = HandlerFactory.FIFTY.build();
        handler20.setNext(handler5);
        handler50.setNext(handler20);
        handler50.process(181);
    }
}