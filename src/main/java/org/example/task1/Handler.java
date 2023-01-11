package org.example.task1;

public interface Handler {
    void setNext(Handler handler);
    void process(int price);
}
