package com.example.demo.controller;

import com.example.demo.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @PostMapping("/createAccount")
    public String createAccount(@RequestBody Account account) {
        // Logic to save account
        return "Account created for " + account.getName();
    }

    @PutMapping("/updateAccount/{accountNo}")
    public String updateAccount(@PathVariable Long accountNo, @RequestBody Account account) {
        // Logic to update account
        return "Account updated for ID: " + accountNo;
    }

    @GetMapping("/viewPolicy/{accountNo}")
    public String viewPolicy(@PathVariable Long accountNo) {
        // Logic to fetch account
        return "Account details for ID: " + accountNo;
    }

    @DeleteMapping("/deletePolicy/{accountNo}")
    public String deletePolicy(@PathVariable Long accountNo) {
        // Logic to delete account
        return "Account deleted for ID: " + accountNo;
    }
}
