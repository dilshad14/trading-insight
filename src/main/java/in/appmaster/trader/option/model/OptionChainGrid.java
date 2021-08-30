/*package in.appmaster.trader.option.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang.StringUtils;

@Entity
@Table(name="OPTIONCHAINGRID")
public class OptionChainGrid {
 @Id
 private Long id; 

	//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OPTIONCHAINGRIDID")
	private Long optionChainGridId;
	
	@OneToMany(mappedBy="optionChainGrid")
	private List<OptionChain> lstOptionChain;
	

	
	@Override
	public boolean equals(Object o) {

		if (!(o instanceof OptionChainGrid)) {
			return false;
		} else {
			OptionChainGrid ocg = (OptionChainGrid) o;
			if(   this.optionChainGridId == ocg.optionChainGridId
					&& this.getPut().equals(oc.getPut())){				
				return true;
			}else{
				return false;		
			}
			
		}
		
	}

	public String toString(){
		StringBuilder sb = new StringBuilder()
		.append("\n")
        .append(StringUtils.rightPad("OI",10))
		.append(StringUtils.rightPad("Chng in OI",10))
		.append(StringUtils.rightPad("Volume",10))
		.append(StringUtils.rightPad("IV",10))
		.append(StringUtils.rightPad("LTP",10))
		.append(StringUtils.rightPad("Net Chnge",10))
		.append(StringUtils.rightPad("Bid Qty",10))
		.append(StringUtils.rightPad("Bid Price",10))
		.append(StringUtils.rightPad("Ask price",10))
		.append(StringUtils.rightPad("Ask Qty",10))	
		.append(StringUtils.rightPad("STRIKE PRICE",10))
		.append(StringUtils.rightPad("Bid Qty",10))
		.append(StringUtils.rightPad("Bid Price",10))
		.append(StringUtils.rightPad("Ask Price",10))
		.append(StringUtils.rightPad("Ask Qty",10))
		.append(StringUtils.rightPad("Net Change",10))
		.append(StringUtils.rightPad("IV",10))
		.append(StringUtils.rightPad("Volume",10))
		.append(StringUtils.rightPad("Chng in OI",10))
		.append(StringUtils.rightPad("OI",10))
		.append("\n");
		
		for(OptionChain oc: this.lstOptionChain){
			sb.append(oc.toString());
		}		
		return sb.toString();	
	}

	*//**
	 * @return the optionChainGridId
	 *//*
	public Long getOptionChainGridId() {
		return optionChainGridId;
	}

	*//**
	 * @param optionChainGridId the optionChainGridId to set
	 *//*
	public void setOptionChainGridId(Long optionChainGridId) {
		this.optionChainGridId = optionChainGridId;
	}

	*//**
	 * @return the optionChainId
	 *//*
	public List<OptionChain> getOptionChainId() {
		return lstOptionChain;
	}

	*//**
	 * @param optionChainId the optionChainId to set
	 *//*
	public void setOptionChainId(List<OptionChain> optionChainId) {
		this.lstOptionChain = optionChainId;
	}
	

*//**
 * @return the id
 *//*
public Long getId() {
	return id;
}

*//**
 * @param id the id to set
 *//*
public void setId(Long id) {
	this.id = id;
}

*//**
 * @return the lstOptionChain
 *//*
public List<OptionChain> getLstOptionChain() {
	return lstOptionChain;
}

*//**
 * @param lstOptionChain the lstOptionChain to set
 *//*
public void setLstOptionChain(List<OptionChain> lstOptionChain) {
	this.lstOptionChain = lstOptionChain;
}
}
*/