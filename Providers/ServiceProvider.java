package Providers;

import Services.*;
import Payment.*;


public abstract class ServiceProvider {
        protected Service service ;
        protected Form form ;
        protected PaymentMethods paymentMethods;  
        protected String name;

        public void fillForm() {
        	form.fillForm();
        }
        
        public Form getForm() {
        	return form;
        }
}
