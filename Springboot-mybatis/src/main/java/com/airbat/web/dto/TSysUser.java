package com.airbat.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * t_sys_user
 * @author 
 */
public class TSysUser implements Serializable {
    private Long f_id;
    private String f_login_name;
    private String f_passwd;
    private String f_name;
    private Date f_create_date;

    public Long getF_id() {
        return f_id;
    }

    public void setF_id(Long f_id) {
        this.f_id = f_id;
    }

    public String getF_login_name() {
        return f_login_name;
    }

    public void setF_login_name(String f_login_name) {
        this.f_login_name = f_login_name;
    }

    public String getF_passwd() {
        return f_passwd;
    }

    public void setF_passwd(String f_passwd) {
        this.f_passwd = f_passwd;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public Date getF_create_date() {
        return f_create_date;
    }

    public void setF_create_date(Date f_create_date) {
        this.f_create_date = f_create_date;
    }
}
