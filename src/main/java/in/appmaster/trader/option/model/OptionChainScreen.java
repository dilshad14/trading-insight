package in.appmaster.trader.option.model;

import in.appmaster.trader.utils.Constants;

import java.time.LocalDateTime;
import java.util.List;
import java.util.StringJoiner;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.StringUtils;


@Entity
@Table(name="OPTIONCHAINSCREEN")
public class OptionChainScreen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OPTIONCHAINSCREENID")
	private Long id;
	
	@Column(name="SYMBOL")
	private String symbol;
	
	@Column(name="SPOTVALUE")
	private float spotValue;
	
	
	@Column(name="SCREENDATE")
	private LocalDateTime asOnScreenDateTime;	
	
	
	@Column(name="FETCHDATE")
	private LocalDateTime fetchDateTime = LocalDateTime.now();
	 
	@OneToMany(mappedBy="optionChainScreen" ,cascade=CascadeType.ALL ,fetch=FetchType.EAGER)
	private List<OptionChain> lstOptionChain;
	
	
	
	@Override
	public boolean equals(Object o) {
		
		if (!(o instanceof OptionChainScreen)) {
			return false;
		} else {
			OptionChainScreen ocs = (OptionChainScreen) o;
			if(this.asOnScreenDateTime.equals(ocs.asOnScreenDateTime)){				
				return true;
			}else{
				return false;		
			}
			
		}
	}
	
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the spotValue
	 */
	public float getSpotValue() {
		return spotValue;
	}

	/**
	 * @param spotValue the spotValue to set
	 */
	public void setSpotValue(float spotValue) {
		this.spotValue = spotValue;
	}



	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(symbol +" " + spotValue +" " + Constants.AS_ON_  + asOnScreenDateTime + " " + 
				new StringJoiner(":","[","]").add(Constants.DATA_FETCHED_AT).add(fetchDateTime.toString()))
		.append(Constants.LINE_BREAK )
        .append(StringUtils.rightPad("OI",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Chng in OI",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Volume",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("IV",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("LTP",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Net Chnge",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Bid Qty",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Bid Price",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Ask price",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Ask Qty",Constants.COLUMN_LENGTH))	
		.append(StringUtils.rightPad("STRIKE PRICE",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Bid Qty",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Bid Price",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Ask Price",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Ask Qty",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Net Change",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("IV",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Volume",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("Chng in OI",Constants.COLUMN_LENGTH))
		.append(StringUtils.rightPad("OI",Constants.COLUMN_LENGTH))
		.append(Constants.LINE_BREAK );	
		
		for(OptionChain oc: this.lstOptionChain){
			sb.append(oc.toString());
		}		
		return sb.toString();
	}

	public List<OptionChain> getLstOptionChain() {
		return lstOptionChain;
	}

	public void setLstOptionChain(List<OptionChain> lstOptionChain) {
		this.lstOptionChain = lstOptionChain;
	}

	public String getUnderlyingIndex() {
		return symbol;
	}

	public void setUnderlyingIndex(String underlyingIndex) {
		this.symbol = underlyingIndex;
	}

	public float getIndexValue() {
		return spotValue;
	}

	public void setIndexValue(float indexValue) {
		this.spotValue = indexValue;
	}

	public LocalDateTime getAsOnScreenDateTime() {
		return asOnScreenDateTime;
	}

	public void setAsOnScreenDateTime(LocalDateTime asOnScreenDateTime) {
		this.asOnScreenDateTime = asOnScreenDateTime;
	}



	public LocalDateTime getFetchDateTime() {
		return fetchDateTime;
	}

	public void setFetchDateTime(LocalDateTime fetchDateTime) {
		this.fetchDateTime = fetchDateTime;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	

}
