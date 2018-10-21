package globalproject.data;

import globalproject.domain.User;

/**
 *
 * @author Jose Flavio
 */
public final class Session {
    
    private static Session currentSession;
    private boolean isLogged;
    private User loggedUser;

    public Session() {
    }
    
    public static Session getCurrentSession(){
        if(currentSession == null){
            currentSession = new Session();
        }
        return currentSession;
    }
    
    public void login(User user){
        this.loggedUser = user;
        this.isLogged = true;
    }

    public void logout(){
        this.loggedUser = null;
        this.isLogged = false;
    }
    
    public User getLoggedUser() {
        return loggedUser;
    }

    public boolean isLogged() {
        return isLogged;
    }
    
}
