package com.account.dto.model;

import java.io.Serializable;
import java.math.BigDecimal;


public class TransactionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal creditAmmount;

	private BigDecimal debitAmmount;

	private String debitCredit;

	private String transaction;

	public TransactionDTO() {
	}

	public BigDecimal getCreditAmmount() {
		return this.creditAmmount;
	}

	public void setCreditAmmount(BigDecimal creditAmmount) {
		this.creditAmmount = creditAmmount;
	}

	public BigDecimal getDebitAmmount() {
		return this.debitAmmount;
	}

	public void setDebitAmmount(BigDecimal debitAmmount) {
		this.debitAmmount = debitAmmount;
	}

	public String getDebitCredit() {
		return this.debitCredit;
	}

	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}

	public String getTransaction() {
		return this.transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "TransactionDTO [creditAmmount=" + creditAmmount + ", debitAmmount=" + debitAmmount + ", debitCredit="
				+ debitCredit + ", transaction=" + transaction + "]";
	}

	
	
}