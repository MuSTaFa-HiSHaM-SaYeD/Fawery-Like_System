package All.providers;

import All.services.*;
import All.PaymentSystem.*;

import java.util.ArrayList;


public abstract class ServiceProvider {
        //protected Service service ;
        //protected PaymentMethods paymentMethods;

        protected String name ;
        public Form form ;
        protected ArrayList<String> paymentMethods ;

        public void fillForm(){
                form.fillForm() ;
        }

        public Form getForm() {
                return form;
        }
}
