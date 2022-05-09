package singleresponsibility.after;

import java.time.LocalDate;

public class Deliverymanager {

    public void getdetails(ComputerI com) {
        System.out.println("The computer "+com.productId+" will be delivered on");
        LocalDate datedlvr = LocalDate.now().plusDays(30);
        System.out.println(datedlvr);

    }
}
