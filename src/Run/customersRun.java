package Run;


import module.customersDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class customersRun{

    public static void main(String[] args) throws SQLException{


        System.out.println("You entered the customer details system");
        System.out.println("Enter 1 to check the existing account details");
        System.out.println("Enter 2 to modify the existing account");
        System.out.println("Enter 3 to generate monthly bill for a given month and year");
        System.out.println("Enter 4 to display transactions between two dates");
        System.out.println("Please choose an option");


        Scanner Input = new Scanner(System.in);

        int input_customer = Input.nextInt();
        if (input_customer == 1) {

            System.out.println("Please enter your social security number:");
            int ssn_1 = Input.nextInt();

            customersDaoImpl c1 = new customersDaoImpl();
            c1.checkAccount(ssn_1);
        }

        if (input_customer == 2) {

            customersDaoImpl c2 = new customersDaoImpl();

            System.out.println("Please enter your social security number: ");
            int ssn_2 = Input.nextInt();
            if(!c2.checkSSN(ssn_2).next()){

                System.out.println("The database don't records for you Social Security Number\nPlease check your SSN");

            }
            else{

                Scanner Input_2 = new Scanner(System.in);

                System.out.println("Please enter your new apartment number");
                String apt_no = Input_2.nextLine();


                System.out.println("Please enter your new street name");
                String street_name = Input_2.nextLine();

                System.out.println("Please enter your new city");
                String city = Input_2.nextLine();

                System.out.println("Please enter your new state");
                String state = Input_2.nextLine();

                System.out.println("Please enter your new zip code");
                String zip_code =Input_2.nextLine();


                c2.modifyAccount(apt_no, street_name, city, state, zip_code, ssn_2);
            }
        }

        if (input_customer == 3) {
            customersDaoImpl c3 = new customersDaoImpl();
            Scanner Input_3 = new Scanner(System.in);

            System.out.println("Please enter your social security number: ");
            int ssn_3 = Input.nextInt();
            if(!c3.checkSSN(ssn_3).next()){

                System.out.println("The database don't records for you Social Security Number\nPlease check your SSN");

            }
            else{

                System.out.println("Please enter your credit card number: ");
                String credit_card_no = Input_3.nextLine();

                System.out.println("Please enter the month");
                int month =Input.nextInt();

                System.out.println("Please enter the year ");
                int year = Input.nextInt();


                c3.getMonthlyBill(credit_card_no,month,year);
            }
        }


        if (input_customer == 4) {

            customersDaoImpl c4 = new customersDaoImpl();

            System.out.println("Welcome to check your transactions");

            System.out.println("Please enter your social security number: ");
            int ssn_4 = Input.nextInt();
            if(!c4.checkSSN(ssn_4).next()){

                System.out.println("The database don't records for you Social Security Number\nPlease check your SSN");

            }
            else{

                System.out.println("Please enter a year");
                int year1 = Input.nextInt();

                System.out.println("Please enter a month");
                int month1 = Input.nextInt();

                System.out.println("Please enter a day");
                int day1= Input.nextInt();

                System.out.println("Please enter another year which is greater or equal than the one you just entered");
                int year2= Input.nextInt();

                System.out.println("Please enter another month which is greater or equal than the one you just entered");
                int month2= Input.nextInt();

                System.out.println("Please enter another day which is greater or equal than the one you just entered");
                int day2= Input.nextInt();



                c4.checkTransactionBetweenDates(year1, month1, day1, year2,month2,day2, ssn_4);
            }
        }

    }
}


