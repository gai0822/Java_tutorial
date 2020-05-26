package Gatech;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* acknowledge the difference between ITelephone hgaiPhone and DeskPhone hgaiPhone,
        * initialize using interface makes you only access those methods defined by the interface,
        * e.g. you can not getMyNumber in hgaiPhone
        */
        ITelephone hgaiPhone;
        hgaiPhone = new DeskPhone(10086);
        // System.out.println(hgaiPhone.getMyNumber());
        hgaiPhone.powerOn();
        hgaiPhone.callPhone(12345);
        hgaiPhone.answer();

        List
    }
}
