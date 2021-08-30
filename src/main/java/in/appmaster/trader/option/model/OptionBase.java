package in.appmaster.trader.option.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPTION")
public class OptionBase {
	
	public OptionBase( ){
		
		}
	
	public OptionBase(String type){
		this.optionType = type;
		}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OPTIONID")
	private Long optionId;
	
	@Column(name="OPTIONTYPE")
	private String optionType;
	
	@Column(name="BIDQTY")	
	private int bidQty;
	
	@Column(name="BIDPRICE")
	private float bidPrice;
	
	@Column(name="ASKQTY")
	private int askQty;
	
	@Column(name="ASKPRICE")
	private float askPrice;

	@Column(name="NETCHANGE")
	private float netChange;
	
	@Column(name="LTP")
	private float ltp;
	
	@Column(name="IV")
	private float iv;
	
	@Column(name="VOLUME")
	private long volume;
	
	@Column(name="CHNGINOI")
	private long chngInOI;
	
	@Column(name="OI")
	private long OI;
	

	/**
	 * @return the optionType
	 */
	public String getOptionType() {
		return optionType;
	}

	/**
	 * @param optionType the optionType to set
	 */
	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}


	/**
	 * @return the bidQty
	 */
	public int getBidQty() {
		return bidQty;
	}

	/**
	 * @param bidQty
	 *            the bidQty to set
	 */
	public void setBidQty(int bidQty) {
		this.bidQty = bidQty;
	}

	/**
	 * @return the bidPrice
	 */
	public float getBidPrice() {
		return bidPrice;
	}

	/**
	 * @param bidPrice
	 *            the bidPrice to set
	 */
	public void setBidPrice(float bidPrice) {
		this.bidPrice = bidPrice;
	}

	/**
	 * @return the askQty
	 */
	public int getAskQty() {
		return askQty;
	}

	/**
	 * @param askQty
	 *            the askQty to set
	 */
	public void setAskQty(int askQty) {
		this.askQty = askQty;
	}

	/**
	 * @return the askPrice
	 */
	public float getAskPrice() {
		return askPrice;
	}

	/**
	 * @param askPrice
	 *            the askPrice to set
	 */
	public void setAskPrice(float askPrice) {
		this.askPrice = askPrice;
	}

	/**
	 * @return the netChange
	 */
	public float getNetChange() {
		return netChange;
	}

	/**
	 * @param netChange
	 *            the netChange to set
	 */
	public void setNetChange(float netChange) {
		this.netChange = netChange;
	}

	/**
	 * @return the ltp
	 */
	public float getLtp() {
		return ltp;
	}

	/**
	 * @param ltp
	 *            the ltp to set
	 */
	public void setLtp(float ltp) {
		this.ltp = ltp;
	}

	/**
	 * @return the iv
	 */
	public float getIv() {
		return iv;
	}

	/**
	 * @param iv
	 *            the iv to set
	 */
	public void setIv(float iv) {
		this.iv = iv;
	}

	/**
	 * @return the volume
	 */
	public long getVolume() {
		return volume;
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	public void setVolume(long volume) {
		this.volume = volume;
	}

	/**
	 * @return the chngInOI
	 */
	public long getChngInOI() {
		return chngInOI;
	}

	/**
	 * @param chngInOI
	 *            the chngInOI to set
	 */
	public void setChngInOI(long chngInOI) {
		this.chngInOI = chngInOI;
	}

	/**
	 * @return the oI
	 */
	public long getOI() {
		return OI;
	}

	/**
	 * @param oI
	 *            the oI to set
	 */
	public void setOI(long oI) {
		OI = oI;
	}

	@Override
	public boolean equals(Object o) {

		if (!(o instanceof OptionBase)) {
			return false;
		} else {
			// write actual check clause here
			OptionBase ocb = (OptionBase) o;
			if (this.askPrice == ocb.getAskPrice()
					&& this.askQty == ocb.getAskQty()
					&& this.bidPrice == ocb.getBidPrice()
					&& this.bidQty == ocb.getBidQty()
					&& this.chngInOI == ocb.getChngInOI()
					&& this.iv == ocb.getIv() && this.ltp == ocb.getLtp()
					&& this.netChange == ocb.getNetChange()
					&& this.OI == ocb.getOI() && this.volume == ocb.getVolume()) {
				return true;
			} else {
				return false;
			}
		}

	}

}
