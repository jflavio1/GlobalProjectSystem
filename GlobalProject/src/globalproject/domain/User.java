package globalproject.domain;

/**
 *
 * @author Jose Flavio
 */
public class User {
    
    private String userFormalName;
    private String userName;
    private String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserFormalName() {
        return userFormalName;
    }

    public void setUserFormalName(String userFormalName) {
        this.userFormalName = userFormalName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
}
