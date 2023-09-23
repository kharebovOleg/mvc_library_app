package org.example.web.dto;

public class LoginForm {

    private String username;
    private String password;

    public LoginForm(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public LoginForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "userName='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
