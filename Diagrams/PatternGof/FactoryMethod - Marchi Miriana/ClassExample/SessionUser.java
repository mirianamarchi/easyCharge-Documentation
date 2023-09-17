public class SessionUser implements Session{

    private static UserBean userSession;

    public SessionUser() {
        //constructor
    }

    @Override
    public void setSession(UserBean userSession) {
        if (this.userSession == null) {
            this.userSession = userSession;
        }
    }

    @Override
    public void UserBean getSession() {
        return userSession;
    }

    @Override
    public void closeSession() {
        userSession = null;
    }
}
