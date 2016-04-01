package com.team11.phonebill;

public abstract class PlanRates {
	public double basicMontlyRate;
	public double ratePerExcessMinute;
	public int includeMinutes;
	public double additionalLineRate;

	public abstract double getBasicMonthlyRate();
	
	public abstract int getIncludedMinutes();
	
	public abstract double getRatePerExcessMinute();
	
	public abstract double getAdditionalLineRate();
}
