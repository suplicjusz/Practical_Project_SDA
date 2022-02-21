package pl.sda.bank;

import pl.sda.bank.exceptions.AccountNotFoundException;

public class MainTest {
    /* Main testowy służący do sprawdzenia funkcjonalności napisanego kodu, który został napisany */


    public static void main(String[] args) throws AccountNotFoundException {

        Bank bank = new Bank();


        bank.addNewClient();
        System.out.println(bank.getClientList().toString());



        /*Client client1 = new Client("1", "Alex", "b", address, listClient1);
        Account accountAlex1 = new Account("57775757", Currency.PLN);
        Account accountAlex2 = new Account("999997", Currency.PLN);
        client1.createNewAccount(listClient1,accountAlex1);
        client1.createNewAccount(listClient1, accountAlex2);
        System.out.println(listClient1);
        client1.removeAccount(accountAlex1, listClient1);
        System.out.println(listClient1);*/


    }
}
