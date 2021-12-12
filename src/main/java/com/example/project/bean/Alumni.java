package com.example.project.bean;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table
public class Alumni implements  Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,unique = true)
    private String email;  //this will act as a user name for login page

    @Column(nullable = false,unique = true)
    private String contact_no; //validation on js for 10 characters

    @Column(nullable = false)
    private String password;

    public Alumni() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public Integer getId() {
        return id;
    }

    public Alumni(String email, String contact_no, String password) {
        this.email = email;
        this.contact_no = contact_no;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
