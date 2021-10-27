package com.company;

public interface iBorrowable {
    void setBorrowDate(int day);
    void setReturnDate(int day);
    boolean isAvailable(int day);

}
