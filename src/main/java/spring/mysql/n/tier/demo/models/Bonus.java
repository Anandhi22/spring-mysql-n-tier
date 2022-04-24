package spring.mysql.n.tier.demo.models;

import java.sql.Timestamp;

public class Bonus {

	Integer workerRefId;
	Integer bonusAmount;
	Timestamp bonusDate;

	public Bonus() {
		super();
    }

	public Bonus(Integer workerRefId, Integer bonusAmount, Timestamp bonusDate) {
		super();
		this.workerRefId = workerRefId;
		this.bonusAmount = bonusAmount;
		this.bonusDate = bonusDate;
	}

	public Integer getWorkerRefId() {
		return workerRefId;
	}

	public void setWorkerRefId(Integer workerRefId) {
		this.workerRefId = workerRefId;
	}

	public Integer getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(Integer bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public Timestamp getBonusDate() {
		return bonusDate;
	}

	public void setBonusDate(Timestamp bonusDate) {
		this.bonusDate = bonusDate;
	}

	@Override
	public String toString() {
		return "Bonus [workerRefId=" + workerRefId + ", bonusAmount=" + bonusAmount + ", bonusDate=" + bonusDate + "]";
	}

}
