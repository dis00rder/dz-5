package lection.src;

import lection.src.exceprions.WrongAccountException;
import lection.src.exceprions.WrongCurrencyException;
import lection.src.exceprions.WrongOperationException;

import javax.annotation.processing.Processor;

public class Main {

    public static void main(String[] args) {

        kantor("accountId000", 50, "USD");
        kantor("accountId003", 250, "HRV");
        kantor("accountId001", 50, "EUR");
        kantor("accountId001", 50, "USD");
        kantor("accountId001", 50, "USD");

    }

    public static void kantor(String accountId, int amount, String currency) {
        try {

            BankApplication bankApplication = new BankApplication();
            bankApplication.process(accountId, amount, currency);

        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Such account doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account has another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("No enough money");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Thank for using our service");
        }

    }
}


