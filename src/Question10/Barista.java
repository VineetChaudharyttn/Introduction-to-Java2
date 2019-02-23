/** Barista
 - Gets the next order from the queue
 - Prepares the coffee
 - Places the coffee in the completed order queue
 - Places a notification that order for token is ready*/

package Question10;

import java.util.ArrayList;
import java.util.List;

public class Barista {

    String status;

    public String prepareOrder(List<String> list) {
        status="In Process";
        return status;
    }

    public String placedOrderComplete(){
        status="Ready";
        return status;
    }
}
