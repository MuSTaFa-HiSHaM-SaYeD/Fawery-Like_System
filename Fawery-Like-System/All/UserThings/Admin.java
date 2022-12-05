package All.UserThings;

import All.refundSystem.Refund;

public class Admin extends User{
    public void approveAndRejectRefundRequests() {
        Refund refund = new Refund();

        refund.approveAndRejectRefundRequests();
    }
}
