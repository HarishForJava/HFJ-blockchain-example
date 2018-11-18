package com.hfj.blockchain;

public class Transaction {

	private Long amount;

	public Long getSum() {
		return amount;
	}

	public void setSum(Long sum) {
		this.amount = sum;
	}

	public Transaction(Long sum) {
		this.amount = sum;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Transaction that = (Transaction) o;

		return amount != null ? amount.equals(that.amount) : that.amount == null;
	}

	@Override
	public int hashCode() {
		int result = (amount != null ? amount.hashCode() : 0);
		return result;
	}
}
