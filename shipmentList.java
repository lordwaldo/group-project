package com.example.sportinggoods;

public class shipmentList {
    public int count = 0;
    public shipment accArr[] = new shipment[10];
    public void addAccount(shipment a1){

        accArr[count] = a1;   //put the new Account object a1 into the accArr
        count++;                     //increase the count by 1 since we just added one

    } //end addAccount
    public void displayList() {

        for (int x=0; x<count; x++) {
            accArr[x].display(); //the Account class has a display() method
        }

    }//end displayList()

    public static void main(String args[]) {

        shipmentList alist = new shipmentList();

        shipment a = new shipment("10/14-9:00", "p45","m78","e2323","t565","shipped");
        shipment b = new shipment("10/26-11:30", "p08","m34","e6894","t331"," not shipped");

        alist.addAccount(a);
        alist.addAccount(b);

        alist.displayList();  //prints the list which should contain 2 Accounts
    }
}
