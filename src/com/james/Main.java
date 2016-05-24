package com.james;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static InvItem categoryItem (String name, Integer quantity, String category) {
        category = category.toLowerCase();

            switch (category) {
                case "1":
                    return new Vegetable(name, quantity);
                case "2":
                    return new Fruit(name, quantity);
                case "3":
                    return new Bread(name, quantity);
                case "4":
                    return new Pasta(name, quantity);
                case "5":
                    return new Meat(name, quantity);
                default:
                    System.out.println("Incorrect input");
        }
        return null;
    }

    //create item
    private static void createItem(Scanner scanner, ArrayList<InvItem> items) {
        System.out.println("Enter new item");
        String text = scanner.nextLine();
        System.out.println("Enter # to assign category: vegetable [1], fruit [2], bread [3], pasta [4], meat [5]");
        String category = scanner.nextLine();
        InvItem newItem =  categoryItem(text, 0, category);
        if(newItem != null) {
            items.add(newItem);
        }

    }

    //remove item
    private static void removeItem(Scanner scanner, ArrayList<InvItem> items) {
        System.out.println("Enter # of item you wish to remove");
        String numItem = scanner.nextLine();
        int num = Integer.valueOf(numItem);
        items.remove(num - 1);
    }

    //update quantity
    private static void updateQuantity (Scanner scanner, ArrayList<InvItem> items) {
        System.out.println(("Enter # of item to update quantity"));
        String sameItem = scanner.nextLine();
        System.out.println("Enter new quantity");
        String newAmount = scanner.nextLine();
        int amount =Integer.valueOf(newAmount);
        InvItem something = items.get(Integer.valueOf(sameItem)-1);
        something.setQuantity(amount);
    }

    public static void main(String[] args) {
        ArrayList<InvItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = 1;
            for (InvItem invItem : items) {
                System.out.printf("(%s) %s %s %s\n", i, invItem.name, invItem.quantity, invItem.category);
                i++;
            }
            System.out.println("1. Create new item");
            System.out.println("2. Remove item");
            System.out.println("3. Update quantity");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    //create item
                    createItem(scanner, items);
                    break;

                case "2":
                    //remove item
                    removeItem(scanner, items);
                    break;

                case "3":
                    //update quantity
                    updateQuantity(scanner, items);
                    break;

                default:
                    System.out.println("Incorrect input");

            }
        }

    }
}
