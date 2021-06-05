package com.tuling.entity;

import org.springframework.stereotype.Component;

/**
 * Created by xsls on 2019/6/17.
 */
@Component
public class AccountInfo {

    private Integer id;

    private String accoutId;

    private double blance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccoutId() {
        return accoutId;
    }

    public void setAccoutId(String accoutId) {
        this.accoutId = accoutId;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }


	public AccountInfo() {
		System.out.println("account 创建了");
	}
}
