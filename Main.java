class User {
    private Integer id;
    private String userName;
    private String password;

    public User(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = encryptPassword(password); // Encrypt password when storing
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encryptPassword(password); // Encrypt on set
    }

    // Made it public so UserBo can access it
    public String encryptPassword(String password) {
        String res = "";
        for (int i = 0; i < password.length(); i++) {
            res = res + (char) (password.charAt(i) + 1);
        }
        return res;
    }
}

class UserBo {
    public User[] getUsers() {
        User[] users = new User[5];
        users[0] = new User(1, "saad", "abc");
        users[1] = new User(2, "sayeed", "abf");
        users[2] = new User(3, "azmat", "sbe");
        users[3] = new User(4, "iffat", "sne");
        users[4] = new User(5, "shaheen", "sve");
        return users;
    }

    public boolean validate(String userName, String password) {
        User[] users = getUsers();
        User temp = new User(); // To access encryption
        String encryptedInput = temp.encryptPassword(password);

        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(encryptedInput)) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        UserBo userBo = new UserBo();
        System.out.println(userBo.validate("saad", "abc"));  // should print true
        System.out.println(userBo.validate("saad", "abd"));  // should print false
    }
}