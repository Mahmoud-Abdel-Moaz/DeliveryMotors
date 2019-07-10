package com.example.mahmoudabdelmoaz.deliverymotors.Model;

public class Order {
    String Price,Date,Frome,To,IsCompleted;

    public Order(){}

    public Order(String price, String date, String frome, String to, String isCompleted) {
        Price = price;
        Date = date;
        Frome = frome;
        To = to;
        IsCompleted = isCompleted;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getFrome() {
        return Frome;
    }

    public void setFrome(String frome) {
        Frome = frome;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getIsCompleted() {
        return IsCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        IsCompleted = isCompleted;
    }
}

