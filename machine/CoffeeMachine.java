package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        Scanner scanner = new Scanner(System.in);
        String type = null;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            type = scanner.next();
            switch (type) {
                case "exit":
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String coffeeTypeText = scanner.next();
                    if (coffeeTypeText.equals("back")) {
                        break;
                    }else {
                        switch (Integer.parseInt(coffeeTypeText)) {
                            case 1:
                                if (water >= 250 && beans >= 16 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    cups -= 1;
                                    water -= 250;
                                    beans -= 16;
                                    money += 4;
                                } else if (water < 250) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (beans < 16) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;
                            case 2:
                                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    cups -= 1;
                                    water -=350;
                                    milk -= 75;
                                    beans -=20;
                                    money += 7;
                                } else if (water < 350) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (beans < 20) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;
                            case 3:
                                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    cups -= 1;
                                    water -= 200;
                                    milk -= 100;
                                    beans -= 12;
                                    money += 6;
                                } else if (water < 200) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (beans < 12) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;
                        }
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(beans + " g of coffee beans");
                    System.out.println(cups + " disposable cups");
                    System.out.println("$" + money + " of money");
                    break;
            }
        } while (!type.equals("exit"));


    }
    
}
