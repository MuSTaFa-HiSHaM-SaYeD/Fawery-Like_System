package All.providers;

import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
import All.PaymentSystem.*;



public abstract class ServiceProvider {
        protected Service service ;
        protected Form form ;
        protected PaymentMethods paymentMethods;  
        protected String name;

        public void getForm() {
        	form.fillForm();
        }

}
