package in.appmaster.trader.equity.model;

import java.util.Map;

public class securityWithPctChange {

	
	private String symbol;
	private Float price;
	private Float avgPctChange;
	private Map<String,Float> periodicChangePct;
	

	public Float getAvgPctChange() {
		return avgPctChange;
	}
	public void setAvgPctChange(Float avgPctChange) {
		this.avgPctChange = avgPctChange;
	}
	public Map<String, Float> getPeriodicChangePct() {
		return periodicChangePct;
	}
	public void setPeriodicChangePct(Map<String, Float> periodicChangePct) {
		this.periodicChangePct = periodicChangePct;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
	
	
}
