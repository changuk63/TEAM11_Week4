package com.team11.phonebill;

public abstract class PlanRates {
	public static final double basicMontlyRate = 0;
	public static final double ratePerExcessMinute = 0;
	public static final int includeMinutes = 0;
	public static final double additionalLineRate=0;

	public abstract double getBasicMonthlyRate();
	
	public abstract int getIncludedMinutes();
	
	public abstract double getRatePerExcessMinute();
	
	public abstract double getAdditionalLineRate();
}
