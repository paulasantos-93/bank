package org.academiadecodigo.bootcamp;

/**
 * Piggy bank class
 */
public class Piggybank {

    private int money;

    public int getMoney() {
        return money;
    }

    // returns the amount of money withdrawn
    public int withdraw(int money) {

        // exception case handling
        if (money > this.money) {
            int removedMoney = this.money;
            this.money = 0;
            return removedMoney;
        }

        // normal case
        this.money -= money;
        return money;
    }

    public void deposit(int money) {
       this.money += money;
    }

    @Override
    public String toString() {
        return "PiggyBank{" +
                "money=" + money +
                '}';
    }
}

