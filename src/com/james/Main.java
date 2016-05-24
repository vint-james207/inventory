package com.james;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<InvItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = 1;
            for (InvItem invItem : items) {
                System.out.println(i + " " + invItem.name + invItem.quantity);
                i++;
            }
            System.out.println("1. Create new item");
            System.out.println("2. Remove item");
            System.out.println("3. Update quantity");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Enter new item");
                    String text = scanner.nextLine();
                    InvItem newItem = new InvItem(text,0);
                    items.add(newItem);
                    break;

                case "2":
                    System.out.println("Enter # of item you wish to remove");
                    String numItem = scanner.nextLine();
                    int num = Integer.valueOf(numItem);
                    items.remove(num-1);
                    break;

                case "3":
                    System.out.println(("Enter # of item to update quantity"));
                    String sameItem = scanner.nextLine();
                    System.out.println("Enter new quantity");
                    String newAmount = scanner.nextLine();
                    int amount =Integer.valueOf(newAmount);
                    InvItem something = items.get(Integer.valueOf(sameItem));
                    something.setQuantity(amount);
                    break;

                default:
                    System.out.println("Incorrect input");

            }
        }

    }
}
