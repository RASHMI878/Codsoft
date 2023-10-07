
import java.util.*;
import java.text.*;

class Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" 'Rupee ' ###, ##0.00 ");

    private int AN;
    private int PN;
    private double CB = 2000;
    private double SB = 1000;

    void setAccountNumber(int an) {
        AN = an;

    }

    void setPIN(int pn) {
        PN = pn;

    }

    int getAccountNumber() {
        return AN;
    }

    int getPIN() {
        return PN;
    }

    void getCurrentBalance() {
        System.out.println("\nYour Current Account Balance : " + moneyFormat.format(CB));

    }

    void getSavingBalance() {
        System.out.println("\nYour Saving Account Balance : " + moneyFormat.format(SB));
    }

    void getCurrentWithdrawInput() {
        System.out.println("\nYour Current Account Balance : " + moneyFormat.format(CB));

        System.out.print("\nAmount you want to withdraw from your current account : ");

        double amount = menuInput.nextDouble();

        if ((CB - amount) >= 0) {
            calcCurrentWithdraw(amount);
            System.out.println("Transaction successful...");
            System.out.println("Now, your current account balance : " + moneyFormat.format(CB));
        } else {
            System.out.println("\nYour balace is insufficient for this Transaction.....\n");
        }

    }

    double calcCurrentWithdraw(double amount) {
        CB = CB - amount;
        return CB;
    }

    void getSavingWithdrawInput() {
        System.out.println("\nYour Saving Account Balance : " + moneyFormat.format(SB));

        System.out.print("\nAmount you want to withdraw from your Saving account : ");

        double amount = menuInput.nextDouble();
        // input changes
        if ((SB - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("Transaction successful...");
            System.out.println("Now, your Saving account balance : " + moneyFormat.format(SB));
        } else {
            System.out.println("\nYour balace is insufficient for this Transaction.....\n");
        }

    }

    // output changes
    double calcSavingWithdraw(double amount) {
        SB = SB - amount;
        return SB;
    }

    void getCurrentDepositeInput() {
        System.out.println("\nYour Saving Account Balance : " + moneyFormat.format(CB));

        System.out.print("\nAmount you want to be deposite to your current  account : ");

        double amount = menuInput.nextDouble();
        // input changes
        if ((CB + amount) >= 0) {
            calcCurrentDeposited(amount);
            System.out.println("Transaction successful...");
            System.out.println("Now, your current account balance : " + moneyFormat.format(CB));
        } else {
            System.out.println("\nYour balace is insufficient for this Transaction.....\n");
        }

    }

    double calcCurrentDeposited(double amount) {
        CB = CB + amount;
        return CB;
    }

    void getSavingDepositeInput() {
        System.out.println("\nYour Saving Account Balance : " + moneyFormat.format(SB));

        System.out.print("\nAmount you want to be deposite to your current  account : ");

        double amount = menuInput.nextDouble();
        // input changes
        if ((SB + amount) >= 0) {
            calcSavingDeposited(amount);
            System.out.println("Transaction successful...");
            System.out.println("Now, your saving account balance : " + moneyFormat.format(SB));
        } else {
            System.out.println("\nPlease enter valid input.....\n");
        }

    }

    double calcSavingDeposited(double amount) {
        SB = SB + amount;
        return SB;
    }

}

class Option_Menu extends Account {

    Scanner menuInput = new Scanner(System.in);// new is constructor
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    void getLogin() {
        int TTT = 125125;
        do {
            try {
                // database
                data.put(11111, 111);
                data.put(22222, 222);
                data.put(33333, 333);
                data.put(44444, 444);

                System.out.println("......Welcome to the ATM!......");
                System.out.print("Enter your Account Number : ");
                setAccountNumber(menuInput.nextInt());

                System.out.print("Enter PIN : ");
                setPIN(menuInput.nextInt());

                int P = getAccountNumber(); // input will swift in P which gives more security
                int R = getPIN();

                if (data.containsKey(P) && data.get(P) == R)// .containsKey will check if P is there in Collection or
                                                            // not AND .get means we will extract P from database and
                                                            // then we will match R
                {
                    getAccountType();
                } else {
                    System.out.println(" Wrong Customer number or Pin number.........");
                    System.out.println(" please try again with valid Account number and PIN number.");
                }

            } catch (InputMismatchException e) {

                System.out.println("\n please enter only numbers\n characters and symbols are not allowed");
                TTT = 125126;
            }
        } while (TTT == 125125);
    }

    void getAccountType() {
        System.out.println("Select the Account TYpe you want to access:");
        System.out.println("Type 1 : Current Account");
        System.out.println("Type 2 : Saving Account");
        System.out.println("Type 3 : Exit");
        System.out.print(" Enter Your Choice : ");

        int Select = menuInput.nextInt();

        switch (Select) {
            case 1:
                getCurrent();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thankyou for using this ATM");
                System.out.println("Visit Again");
                break;

            default:
                System.out.println("Invalid Choice!!");
                System.out.println("Please enter valid choice..");
                break;

        }

    }

    void getCurrent() {
        System.out.println("\nCurrent Account  ");
        System.out.println("Type 1 : View Balance");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3 : Deposite Funds ");
        System.out.println("TYpe 4 : Exit");
        System.out.print("choice : ");

        int Select = menuInput.nextInt();
        switch (Select) {
            case 1:
                getCurrentBalance();
                getAccountType();
                break;
            case 2:
                getCurrentWithdrawInput();
                getAccountType();

                break;
            case 3:
                getCurrentDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thankyou for using this ATM");
                System.out.println("Visit Again");
                break;

            default:
                System.out.println("Invalid Choice!!");
                System.out.println("Please enter valid choice..");
                break;

        }
    }

    void getSaving() {
        System.out.println("Saving Account  ");
        System.out.println("Type 1 : View Balance");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3 : Deposite Funds ");
        System.out.println("TYpe 4 : Exit");
        System.out.print("choice : \n");

        int Select = menuInput.nextInt();
        switch (Select) {
            case 1:
                getSavingBalance();
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thankyou for using this ATM");
                System.out.println("Visit Again");
                break;

            default:
                System.out.println("Invalid Choice!!");
                System.out.println("Please enter valid choice..");
                break;

        }
    }

}

public class Atminterface extends Option_Menu {

    public static void main(String[] args) {

        Option_Menu oh1 = new Option_Menu();
        oh1.getLogin();
    }

}
