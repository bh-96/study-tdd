package com.bh.tdd;

import com.bh.tdd.service.AccountService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTests {

    private AccountService accountService;

    @Before
    public void setup() {
        accountService = new AccountService(10000);
    }

    @Test
    public void test_객체_생성() throws Exception {
        System.out.println(accountService.getBalance());
    }

    @Test
    public void test_입금() throws Exception {
        Assert.assertEquals("입금 실패", 11000, accountService.deposit(1000));
    }

    @Test
    public void test_출금() throws Exception {
        Assert.assertEquals("입금 실패", 9500, accountService.withdraw(500));
    }
}
