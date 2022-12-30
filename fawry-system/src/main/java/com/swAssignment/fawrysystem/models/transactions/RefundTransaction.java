package com.fci.fawrySystem.persons_service.models.transactions;

public class RefundTransaction extends Transaction{
	   private String serviceName;
	   public RefundTransaction(String email, double amount,String serviceName) {
			super(email, amount);
			this.serviceName=serviceName;
	   }
	   public String getServiceName() {
		  return serviceName;
	   }

	   public void setServiceName(String serviceName) {
		  this.serviceName = serviceName;
	   }
}
