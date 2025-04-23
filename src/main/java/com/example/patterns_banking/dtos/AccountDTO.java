package com.example.patterns_banking.dtos;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
  private String number;
  private String type;
  private BigDecimal balance;
  private Boolean isActive;
}
