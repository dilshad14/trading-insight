package in.appmaster.trader.option.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang.StringUtils;

import in.appmaster.trader.utils.Constants;

@Entity
@Table(name="OPTIONCHAIN")
public class OptionChain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OPTIONCHAINID")
	private Long optionChainId;
	
	@Column(name="STRIKEPRICE")
	private float strikePrice;
	
	
	@OneToOne(cascade=CascadeType.ALL ,fetch=FetchType.EAGER /*,mappedBy="optionId"*/)
	//@JoinColumn(name="OPTIONID")
	private OptionBase call;
	
	
	@OneToOne(cascade=CascadeType.ALL ,fetch=FetchType.EAGER/*,mappedBy="optionId"*/)
	//@JoinColumn(name="OPTIONID")
	private OptionBase put;
	
	@ManyToOne(cascade=CascadeType.ALL ,fetch=FetchType.EAGER)
	@JoinColumn(name="OPTIONCHAINSCREENID")
	private OptionChainScreen optionChainScreen;
	
	
	public Long getOptionChainId() {
		return optionChainId;
	}
	public void setOptionChainId(Long optionChainId) {
		this.optionChainId = optionChainId;
	}
	public OptionChainScreen getOptionChainScreen() {
		return optionChainScreen;
	}
	public void setOptionChainScreen(OptionChainScreen optionChainScreen) {
		this.optionChainScreen = optionChainScreen;
	}
	public OptionBase getCall() {
		return call;	
	}
	public void setCall(OptionBase call) {
		this.call = call;
	}
	public OptionBase getPut() {
		return put;			
	}
	public void setPut(OptionBase put) {
		this.put = put;
	}
	
	
	@Override
	public boolean equals(Object o) {

		if (!(o instanceof OptionChain)) {
			return false;
		} else {
			OptionChain oc = (OptionChain) o;
			if(   this.strikePrice == oc.strikePrice
					&& this.getCall().equals(oc.getCall())
					&& this.getPut().equals(oc.getPut())){				
				return true;
			}else{
				return false;		
			}
			
		}
		
	}

	public String toString(){
		StringBuilder sb1 = new StringBuilder();
		sb1.append(Constants.LINE_BREAK)
				.append(StringUtils.rightPad(new Long(call.getOI()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Long(call.getChngInOI()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Long(call.getVolume()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Float(call.getIv()).toString(),Constants.COLUMN_LENGTH)) 
				.append(StringUtils.rightPad(new Float(call.getLtp()).toString(),Constants.COLUMN_LENGTH)) 
				.append(StringUtils.rightPad(new Float(call.getNetChange()).toString(),Constants.COLUMN_LENGTH)) 
				.append(StringUtils.rightPad(new Integer(call.getBidQty()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Float(call.getBidPrice()).toString(),Constants.COLUMN_LENGTH)) 
				.append(StringUtils.rightPad(new Float(call.getAskPrice()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Float(call.getAskQty()).toString(),Constants.COLUMN_LENGTH)) 
				
				.append(StringUtils.rightPad(new Float(this.getStrikePrice()).toString(),Constants.COLUMN_LENGTH))  //STRIKE PRICE

				.append(StringUtils.rightPad(new Integer(put.getBidQty()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Float(put.getBidPrice()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Float(put.getAskPrice()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Float(put.getAskQty()).toString(),Constants.COLUMN_LENGTH)) 
				.append(StringUtils.rightPad(new Float(put.getNetChange()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Float(put.getLtp()).toString(),Constants.COLUMN_LENGTH)) 
				.append(StringUtils.rightPad(new Float(put.getIv()).toString(),Constants.COLUMN_LENGTH)) 
				.append(StringUtils.rightPad(new Long(put.getVolume()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Long(put.getChngInOI()).toString(),Constants.COLUMN_LENGTH))
				.append(StringUtils.rightPad(new Long(put.getOI()).toString(),Constants.COLUMN_LENGTH)) 
				.append(Constants.LINE_BREAK);
		return sb1.toString();
	}
	public float getStrikePrice() {
		return strikePrice;
	}
	public void setStrikePrice(float strikePrice) {
		this.strikePrice = strikePrice;
	}
	
}
