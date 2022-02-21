package com.sanket.details;

public class Data {
    private int id;
    private String name;
    private String email;
    private String company;

    public Data(int id,String name,String email,String company){
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany() {
        return company;
    }
}
