package org.example.model;

public abstract class Item {
    private String title;
    private String borrower;
    private String date;

    public Item(String title, String borrower) {
        this.title = title;
        this.borrower = borrower;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrower != null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
