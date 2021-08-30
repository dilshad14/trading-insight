package in.appmaster.trader.equity.model;

import java.time.LocalDate;
import java.util.List;

public class OhlcMatchingEqRequest {
	
	private List<String> lstScripCode; // in case only run for this scrip and not for all NSE scrips
	private LocalDate startDate; // start date of data
	private LocalDate endDate;   // end date of dataset
	//private enum period { DAY,WEEK,MONTH};
	private String periodCode; // grouping code W=weekly, M=monthly
	private Float deltaPct;     // Percent value of increase or decrease in price between given dates.
	
	private Float priceRangeStart;
	private Float priceRangeEnd;
	
	

	public List<String> getLstScripCode() {
		return lstScripCode;
	}
	public void setLstScripCode(List<String> lstScripCode) {
		this.lstScripCode = lstScripCode;
	}
	public Float getPriceRangeStart() {
		return priceRangeStart;
	}
	public void setPriceRangeStart(Float priceRangeStart) {
		this.priceRangeStart = priceRangeStart;
	}
	public Float getPriceRangeEnd() {
		return priceRangeEnd;
	}
	public void setPriceRangeEnd(Float priceRangeEnd) {
		this.priceRangeEnd = priceRangeEnd;
	}
	public void setDeltaPct(Float deltaPct) {
		this.deltaPct = deltaPct;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getPeriodCode() {
		return periodCode;
	}
	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}
	public Float getDeltaPct() {
		return deltaPct;
	}
	
	
	

}
