public abstract class ServiceProvider {
        protected Service service ;
        protected Form form ;
        protected PaymentMethods paymentMethods;  
        protected String name;

        public void getForm() {
        	form.fillForm();
        }

}
