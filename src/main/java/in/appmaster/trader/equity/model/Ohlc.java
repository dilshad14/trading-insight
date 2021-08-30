package in.appmaster.trader.equity.model;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.StringUtils;

import in.appmaster.trader.utils.Constants;
import in.appmaster.trader.utils.Util;

@Entity
@Table(name = "OHLC")
public class Ohlc implements Serializable {

	@Id
	private String id; // concat of Symbol n date XXXXDDMMMYYYY e.g // NIFTY26MAR2018
						
	private String symbol;
	private String series;
	private LocalDate date;

	private Float prevClose;
	private Float openPrice;
	private Float highPrice;
	private Float lowPrice;
	private Float closePrice;
	private Float lastPrice;
	private Float VWAP;
	private Integer totalTradedQuantity;
	private Double turnover;
	private Integer noOfTrades;
	private Integer deliverableQty;
	private LocalDateTime fetchDateTime;
	
	

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void prepareId() {
		if(this.symbol!= null && this.date!=null ){
		this.id = (this.symbol + this.date.format(Util.getDateTimeFormatter("ddMMMyyyy"))).toUpperCase();
		}
	}

	public LocalDateTime getFetchDateTime() {
		return fetchDateTime;
	}

	public void setFetchDateTime(LocalDateTime fetchDateTime) {
		this.fetchDateTime = fetchDateTime;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		 prepareId();
		this.symbol = symbol;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getDDMONYYYYDate() {
		return date.format(Util.getDateTimeFormatter(Constants.NSE_EQ_OHLC_DATE_FORMAT)); // "dd-MMM-yyyy"
	}

	public void setDate(LocalDate date) {
		 prepareId();
		this.date = date;
	}

	public Float getPrevClose() {
		return prevClose;
	}

	public void setPrevClose(Float prevClose) {
		this.prevClose = prevClose;
	}

	public Float getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(Float openPrice) {
		this.openPrice = openPrice;
	}

	public Float getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(Float highPrice) {
		this.highPrice = highPrice;
	}

	public Float getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(Float lowPrice) {
		this.lowPrice = lowPrice;
	}

	public Float getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(Float closePrice) {
		this.closePrice = closePrice;
	}

	public Float getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Float lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Float getVWAP() {
		return VWAP;
	}

	public void setVWAP(Float vWAP) {
		VWAP = vWAP;
	}

	public Integer getTotalTradedQuantity() {
		return totalTradedQuantity;
	}

	public void setTotalTradedQuantity(Integer totalTradedQuantity) {
		this.totalTradedQuantity = totalTradedQuantity;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public Integer getNoOfTrades() {
		return noOfTrades;
	}

	public void setNoOfTrades(Integer noOfTrades) {
		this.noOfTrades = noOfTrades;
	}

	public Integer getDeliverableQty() {
		return deliverableQty;
	}

	public void setDeliverableQty(Integer deliverableQty) {
		this.deliverableQty = deliverableQty;
	}
	
	public String getWeekOfMonthYear(){
		TemporalField wom = WeekFields.of(Locale.getDefault()).of(DayOfWeek.MONDAY, 7).weekOfMonth();		
		String weekOfMonthYear = "W"+getDate().get(wom)+"-"+getDate().getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault())+"-"+getDate().getYear();
		return weekOfMonthYear.toUpperCase();		
	}
	
	public String getMonthYear(){
		
		String MonthYear = getDate().getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault())+"-"+getDate().getYear();
		return MonthYear.toUpperCase();		
	}
	
	

	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(Constants.LINE_BREAK)
				.append(StringUtils.rightPad(this.id, Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.symbol, Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(getDDMONYYYYDate(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.prevClose.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.openPrice.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.highPrice.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.lowPrice.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.lastPrice.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.closePrice.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.VWAP.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.totalTradedQuantity.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.turnover.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.noOfTrades.toString(), Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.deliverableQty.toString(), Constants.COLUMN_LENGTH));
		return sb1.toString();
	}

}
