package in.appmaster.trader.equity.model;

public class Quote {

	private String symbol;
	private float symbolPE;
	private float sectoralIndexPE;
	private String sectoralIndex;
	
	private float currentMarketPrice;
	private float currentPriceChange;
	private float currentPriceChangePercent;
	
	
	private float previousClose;
	private float open;
	private float high;
	private float low;
	private float close;
	private float vWAP;
	private long tradedVolumeShares;
	private float  tradedValueLacs;
	private float  _52weekhigh;
	private float  _52weeklow;
	private float  lowerPriceBand;
	private float upperPriceBand;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getSymbolPE() {
		return symbolPE;
	}
	public void setSymbolPE(float symbolPE) {
		this.symbolPE = symbolPE;
	}
	public float getSectoralIndexPE() {
		return sectoralIndexPE;
	}
	public void setSectoralIndexPE(float sectoralIndexPE) {
		this.sectoralIndexPE = sectoralIndexPE;
	}
	public String getSectoralIndex() {
		return sectoralIndex;
	}
	public void setSectoralIndex(String sectoralIndex) {
		this.sectoralIndex = sectoralIndex;
	}
	public float getCurrentMarketPrice() {
		return currentMarketPrice;
	}
	public void setCurrentMarketPrice(float currentMarketPrice) {
		this.currentMarketPrice = currentMarketPrice;
	}
	public float getCurrentPriceChange() {
		return currentPriceChange;
	}
	public void setCurrentPriceChange(float currentPriceChange) {
		this.currentPriceChange = currentPriceChange;
	}
	public float getCurrentPriceChangePercent() {
		return currentPriceChangePercent;
	}
	public void setCurrentPriceChangePercent(float currentPriceChangePercent) {
		this.currentPriceChangePercent = currentPriceChangePercent;
	}
	public float getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(float previousClose) {
		this.previousClose = previousClose;
	}
	public float getOpen() {
		return open;
	}
	public void setOpen(float open) {
		this.open = open;
	}
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public float getLow() {
		return low;
	}
	public void setLow(float low) {
		this.low = low;
	}
	public float getClose() {
		return close;
	}
	public void setClose(float close) {
		this.close = close;
	}
	public float getvWAP() {
		return vWAP;
	}
	public void setvWAP(float vWAP) {
		this.vWAP = vWAP;
	}
	public long getTradedVolumeShares() {
		return tradedVolumeShares;
	}
	public void setTradedVolumeShares(long tradedVolumeShares) {
		this.tradedVolumeShares = tradedVolumeShares;
	}
	public float getTradedValueLacs() {
		return tradedValueLacs;
	}
	public void setTradedValueLacs(float tradedValueLacs) {
		this.tradedValueLacs = tradedValueLacs;
	}
	public float get_52weekhigh() {
		return _52weekhigh;
	}
	public void set_52weekhigh(float _52weekhigh) {
		this._52weekhigh = _52weekhigh;
	}
	public float get_52weeklow() {
		return _52weeklow;
	}
	public void set_52weeklow(float _52weeklow) {
		this._52weeklow = _52weeklow;
	}
	public float getLowerPriceBand() {
		return lowerPriceBand;
	}
	public void setLowerPriceBand(float lowerPriceBand) {
		this.lowerPriceBand = lowerPriceBand;
	}
	public float getUpperPriceBand() {
		return upperPriceBand;
	}
	public void setUpperPriceBand(float upperPriceBand) {
		this.upperPriceBand = upperPriceBand;
	}
	
	
	

}
