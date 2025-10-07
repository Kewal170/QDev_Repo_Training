class Bank {
    private String username;
    private double amount;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

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
