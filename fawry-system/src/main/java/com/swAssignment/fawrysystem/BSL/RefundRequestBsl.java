package com.swAssignment.fawrysystem.BSL;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.swAssignment.fawrysystem.models.RefundRequest;



@Service
public class RefundRequestBsl {
     private ArrayList<RefundRequest> refundRequests;
     public RefundRequestBsl() {
    	 refundRequests = new ArrayList<>();
     }
     public void clearRefundRequests() {
    	 refundRequests.clear();
     }
     public void addRefundRequest(RefundRequest refundRequest) {
    	 refundRequests.add(refundRequest);
     }
     public ArrayList<RefundRequest> getRefundRequests(){
    	 return refundRequests;
     }
}
