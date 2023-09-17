public class Client {

	private Session session;

	public Client() {

		SessionUserFactory factory = new SessionUserFactory();

		try{
			this.session = factory.createSessionUser();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public static void main (String args[]){
    Client c = new Client();
    UserBean ub= new UserBean();

		System.out.println("Getting session");
		c.session.getSession();

		System.out.println("Setting session");
		c.session.setSession(ub);

}
