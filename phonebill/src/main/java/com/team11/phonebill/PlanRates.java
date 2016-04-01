package com.team11.phonebill;

public abstract class PlanRates {
	private double basicMontlyRate;
	private double ratePerExcessMinute;
	private int includeMinutes;
	private double additionalLineRate;

	public abstract double getBasicMonthlyRate();
	
	public abstract int getIncludedMinutes();
	
	public abstract double getRatePerExcessMinute();
	
	public abstract double getAdditionalLineRate();
}
