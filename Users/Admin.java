package Users;

import Refund.Refund;

public class Admin extends User{

    public void approveAndRejectRefundRequests() {
        Refund refund = new Refund();

        refund.approveAndRejectRefundRequests();
    }

}
