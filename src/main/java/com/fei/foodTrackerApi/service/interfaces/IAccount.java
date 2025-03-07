package com.fei.foodTrackerApi.service.interfaces;

import com.fei.foodTrackerApi.dto.AccountDTO;

public interface IAccount {
    AccountDTO createAccount(AccountDTO accountDTO);
    String login(AccountDTO loginDTO);
    AccountDTO getAccount(Integer id);
    String updateEmail(Integer id, String email);
    boolean updatePassword(String email, String password);
    boolean isEmailValid(String email);
}
