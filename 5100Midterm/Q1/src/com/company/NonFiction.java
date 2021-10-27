package com.company;

public class NonFiction extends Book implements iBorrowable{

    private int startDay;
    private int endDay;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return getTitle() + " all events are true and based on real facts";
    }

    @Override
    public void setBorrowDate(int startDay) {
        this.startDay=startDay;

    }

    @Override
    public void setReturnDate(int endDay) {
        this.endDay=endDay;

    }

    @Override
    public boolean isAvailable(int day) {
        return day >= startDay && day <= endDay;
    }
}
