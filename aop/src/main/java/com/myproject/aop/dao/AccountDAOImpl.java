package com.myproject.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() + " DOING MY DB WORK : ADD ACCOUNT");
    }
}
