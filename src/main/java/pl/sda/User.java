package pl.sda;

import java.util.Objects;

public class User {

    private String login;
    private int yearOfBirth;

    public User(String login, int yearOfBirth) {
        this.login = login;
        this.yearOfBirth = yearOfBirth;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return yearOfBirth == user.yearOfBirth && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, yearOfBirth);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
