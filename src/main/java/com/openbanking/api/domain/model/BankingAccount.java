package com.openbanking.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author "KhaPhan" on 03-Jul-23
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankingAccount {
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private Customer owner;
    private Date createdDate;
    private Date updatedDate;

}
