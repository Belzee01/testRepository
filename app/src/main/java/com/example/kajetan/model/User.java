package com.example.kajetan.model;

/**
 * Created by kajetan on 19.11.15.
 */
public class User {
    private String name;
    private String surname;
    private String mail;
    private String password;

    public User(String name, String surname, String mail, String password){
        setName(name);
        setSurname(surname);
        setMail(mail);
        setPassword(password);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
