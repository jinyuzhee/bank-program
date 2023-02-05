//122106842
public class User {

    private String accountNumber;

    private String lastName;

    private String firstName;
    private double balance;

    private double beginBalance;

    private double totalDeposit;

    private double totalWithdrawal;

    //constructor
    public User(){}

    public User(String accountNumber, String lastName, String firstName, double beginBalance, double balance) {
        this.accountNumber = accountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.beginBalance = beginBalance;
        this.balance = balance;
    }

    //getter and setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBeginBalance() {
        return beginBalance;
    }

    public void setBeginBalance(double beginBalance) {
        this.beginBalance = beginBalance;
    }

    //add interest when end balance >=500
    public void addInterest(User u){
        if (u.getBalance()>=500){
            u.setBalance(u.getBalance() * 1.2);
        }
    }

    //get total
    public double getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(double totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

    public double getTotalWithdrawal() {
        return totalWithdrawal;
    }

    public void setTotalWithdrawal(double totalWithdrawal) {
        this.totalWithdrawal = totalWithdrawal;
    }


}

