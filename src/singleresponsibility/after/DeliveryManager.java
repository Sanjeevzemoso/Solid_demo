package singleresponsibility.after;

import java.time.LocalDate;

public class DeliveryManager {

    public void getDetails(ComputerI com) {
        System.out.println("The Computer "+com.productId+" will be delivered on");
        LocalDate datedlvr = LocalDate.now().plusDays(30);
        System.out.println(datedlvr);

    }
}
