/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunh.dtos;

/**
 *
 * @author trinh
 */
public class Account {
    private int id;
    private String user;
    private String pass;
    private int isSell;
    private int isAdmin;
    private String fullname;
    private String email;
    private int phone;
    
    public Account() {
    }

    public Account(int id, String user, String pass, int isSell, int isAdmin, String fullname, String email, int phone) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.isSell = isSell;
        this.isAdmin = isAdmin;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIsSell() {
        return isSell;
    }

    public void setIsSell(int isSell) {
        this.isSell = isSell;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

   
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", user=" + user + ", pass=" + pass + ", isSell=" + isSell + ", isAdmin=" + isAdmin + '}';
    }

   

    
}
