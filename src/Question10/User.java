/*Customer
  - Pays the cash to the cashier and places his order, get a token number back
  - Waits for the intimation that order for his token is ready
  - Upon intimation/notification he collects the coffee and enjoys his drink*/

package Question10;

import java.util.List;

public class User {
    long orderID;
    int amountPaidByUser;
    String status;
    Cashier order=new Cashier();

    public long placeOrderByCashPayment(List<String> listOfItem){

        status="Placing Order";
        orderID=order.acceptOrdweAndPayment(listOfItem,amountPaidByUser);
        status=order.status;
        return orderID;
    }


    public void notification(){
        synchronized (this){
            status=order.status;
        }
//        set status as notification
    }
}
