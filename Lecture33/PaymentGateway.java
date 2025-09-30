package Lecture33;

public abstract class PaymentGateway {
	
	public int returnbal() {
		
		return 10000;
	}
	
	public abstract void UPI();
	
	public abstract void CC();
	
	
	public static void main(String[] args) {
		PaymentGateway pg = new PaymentGateway() {
            
            public void UPI(){
                System.out.println("This is in PG UPI");
            }

            public void CC(){
                System.out.println("This is in PG CC");
            }

        };

        pg.CC();
        pg.UPI();

        PaymentGateway pg2 = new PaymentGateway() {
            public void UPI(){
                System.out.println("This is in PG2 UPI");
            }

            public void CC(){
                System.out.println("This is in PG2 CC");
            }
        };

        pg2.CC();
        pg2.UPI();
	}
	

}