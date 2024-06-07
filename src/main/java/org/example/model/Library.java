package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public boolean borrowItem(Item item, String borrower) {
        if (item instanceof Periodicals) {
            System.out.println("Periodicals cannot be borrowed!");
            return false;
        }

        if(items.contains(item) & !(item.isBorrowed())){
            System.out.println(borrower +" borrowed " +item.getTitle());
            return true;
        }

        System.out.println(item.getTitle() + " is not available");
        return false;
    }

    public void returnItem(Item item, String borrower) {
        if (item.isBorrowed()) {
            System.out.println(item.getTitle() + " is returned by " + item.getBorrower());
            item.setBorrower(null);
        } else {
            System.out.println(item.getTitle() + " was not borrowed");
        }
    }
}
