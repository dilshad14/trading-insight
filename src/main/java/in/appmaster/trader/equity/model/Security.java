package in.appmaster.trader.equity.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.StringUtils;

import in.appmaster.trader.utils.Constants;

@Entity
@Table(name="Security")
public class Security {
	
	@Id
	private String symbol;
	private String nameOfCompany;
	private String series;
	private LocalDate dateOfListing;
	private Float paidUpValue;
	private Integer marketLot;
	private String isinNumber;
	private Integer faceValue;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public LocalDate getDateOfListing() {
		return dateOfListing;
	}
	public void setDateOfListing(LocalDate dateOfListing) {
		this.dateOfListing = dateOfListing;
	}
	public Float getPaidUpValue() {
		return paidUpValue;
	}
	public void setPaidUpValue(Float paidUpValue) {
		this.paidUpValue = paidUpValue;
	}
	public Integer getMarketLot() {
		return marketLot;
	}
	public void setMarketLot(Integer marketLot) {
		this.marketLot = marketLot;
	}
	public String getIsinNumber() {
		return isinNumber;
	}
	public void setIsinNumber(String isinNumber) {
		this.isinNumber = isinNumber;
	}
	public Integer getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(Integer faceValue) {
		this.faceValue = faceValue;
	}
	
	@Override
	public boolean equals(Object o) {

		if (!(o instanceof Security)) {
			return false;
		} else {
			// write actual check clause here
			Security s = (Security) o;
			if (this.symbol.equals(s.getSymbol())) {
				return true;
			} else {
				return false;
			}
		}

	
	}
	
	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(Constants.LINE_BREAK)
				.append(StringUtils.rightPad(this.symbol, Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.series, Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(this.nameOfCompany, Constants.COLUMN_LENGTH));
		return sb1.toString();
	}

}
