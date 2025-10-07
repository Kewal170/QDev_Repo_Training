/**
 * Practical 14: Write a program to demonstrate encapsulation. 
 */
class Bank {
    private String username;
    private double amount;

    /**
     * Sets the username.
     *
     * @param username username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the username.
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the amount.
     *
     * @param amount amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Returns the amount.
     *
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

}

public class Practical14 {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setUsername("Kewal");
        bank.setAmount(10000);

        String username = bank.getUsername();
        double amount = bank.getAmount();

        System.out.println("Username : " + username + "\nAmount : " + amount);
    }

}
