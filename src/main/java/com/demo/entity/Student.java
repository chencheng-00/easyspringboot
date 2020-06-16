package com.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Component
@Table(name = "student")
public class Student implements Serializable {


    @Id
    @Column(name = "id")
    private String sid;


    @Column(name = "username")
    private String sname;

    @Column(name = "password")
    private String spassword;

    @Column(name = "age")
    private String sage;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", spassword='" + spassword + '\'' +
                ", sage='" + sage + '\'' +
                '}';
    }
}
