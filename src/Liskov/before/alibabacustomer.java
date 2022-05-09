package Liskov.before;

import jdk.swing.interop.SwingInterOpUtils;

public class alibabacustomer extends amazonpage{
    @Override
    public void seeproducts() {
        System.out.println("Seeing amazon products using GUEST id");
    }

    @Override
    public void addtoamazoncart() {
        System.out.println("No information");
    }
}
