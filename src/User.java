import java.util.Date;

public class User {
    private int userId;
    private String userFullName;
    private String userName;
    private String userPassword;
    private Date  userRegisteredDate;

    public User(int userId, String userFullName, String userName, String userPassword, Date  userRegisteredDate) {
        this.userId = userId;
        this.userFullName = userFullName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRegisteredDate = userRegisteredDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
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

    public Date getUserRegisteredDate() {
        return userRegisteredDate;
    }

    public void setUserRegisteredDate(Date  userRegisteredDate) {
        this.userRegisteredDate = userRegisteredDate;
    }

    public boolean LogIn()
    {
        return false;
    }
    public boolean changePassword()
    {
        return false;
    }
}
