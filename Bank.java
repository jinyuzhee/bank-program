import java.util.Scanner;

public class Bank {

    private User[] users = new User[5];

    private int size;

    public void initial() {
        //user1
        User user1 = new User();
        user1.setAccountNumber("10000");
        user1.setLastName("Murphy");
        user1.setFirstName("John");
        user1.setBeginBalance(900);
        user1.setBalance(900);

        //user2
        User user2 = new User("20000", "Jones", "Andy", 700, 700 );
        //user3
        User user3 = new User("30000", "Richardson", "Mary",  900, 300);
        //user4
        User user4 = new User("40000", "Jackson", "Harriet", 300, 300);

        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        size = 4;
    }

    //login
    public void login() {
        int index = 1;
        while ( index < 5){
            Scanner input = new Scanner(System.in);
            System.out.println("Please input your account number：");
            String accountNumber = input.next();


            User u = null;
            for (int i = 0; i < size; i++) {
                if (users[i].getAccountNumber().equals(accountNumber)) {
                    u = users[i];
                    break;
                }
            }
            if (u != null) {
                showMenu(u);
            } else {
                System.out.println("account number wrong");
            }

            index++;
        }

    }


    //show menu
    public void showMenu(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========" + u.getFirstName() + " welcome to the DB Solutions bank =======");

        boolean flag = true;
        while (flag = true) {
            System.out.println("=== 1.Deposit -1.Withdrawal 0.End of transaction ===");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    this.addDeposit(u);
                    break;
                case -1:
                    this.subtractWithdrawal(u);

                    break;
                case 0:
                    this.printStatement(u);
                    flag = false;
                    return;

                default:
                    System.out.println("Input wrong number!");
                    flag = false;
                    break;
            }
        }
    }

    //deposit
    public void addDeposit(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the deposit amount");
        double depositAmount = input.nextDouble();
        u.setBalance(u.getBalance() + depositAmount);
        u.setTotalDeposit(u.getTotalDeposit() + depositAmount);
    }

    //withdrawal
    public void subtractWithdrawal(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how much you would like to withdrawal:");
        double withdrawalAmount = input.nextDouble();
        u.setBalance(u.getBalance() - withdrawalAmount);
        u.setTotalWithdrawal(u.getTotalWithdrawal()+ withdrawalAmount);
    }


    //print statement
    public void printStatement(User u) {
        //add interest
        u.addInterest(u);
        System.out.println("1. Account Number: " + u.getAccountNumber());
        System.out.println("2. Customer Last Name, First Name: " + u.getLastName() + ", " + u.getFirstName());
        System.out.println("3. Beginning Balance: " + u.getBeginBalance());
        System.out.println("4. End Balance: " + u.getBalance());

        //overdrawn notification
        if (u.getBalance()<0){
            System.out.println("Notification: your account is overdrawn");
        }
        System.out.println("5. Total Withdrawal: " + u.getTotalWithdrawal());
        System.out.println("6. Total deposit: " + u.getTotalDeposit());
    }


}
