package com.account.dto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class AccountDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long accountNumber;

	private String accountName;

	private String accountType;

	private Date balanceDate;

	private String currency;

	private BigDecimal openAvailableBalance;

	private List<TransactionDTO> transactions;

	public AccountDTO() {
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return this.balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getOpenAvailableBalance() {
		return this.openAvailableBalance;
	}

	public void setOpenAvailableBalance(BigDecimal openAvailableBalance) {
		this.openAvailableBalance = openAvailableBalance;
	}

	public List<TransactionDTO> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<TransactionDTO> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "AccountDTO [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", balanceDate=" + balanceDate + ", currency=" + currency + ", openAvailableBalance="
				+ openAvailableBalance + ", transactions=" + transactions + "]";
	}

	

}