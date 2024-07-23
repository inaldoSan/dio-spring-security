package dio.dio.spring.security.jwt.dtos;

public class Login {
    private String username;
    private String password;

    //getters e setters

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}