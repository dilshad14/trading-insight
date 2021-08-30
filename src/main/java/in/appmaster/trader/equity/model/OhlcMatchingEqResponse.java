package in.appmaster.trader.equity.model;

import java.time.Duration;
import java.util.List;

public class OhlcMatchingEqResponse {

	private Duration responseTime;
	private Integer totalEqScripCount;
	private Integer matchingEqScripCount;
	private List<securityWithPctChange> securitiesWithPctChange;

	public Duration getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Duration responseTime) {
		this.responseTime = responseTime;
	}

	public Integer getTotalEqScripCount() {
		return totalEqScripCount;
	}

	public void setTotalEqScripCount(Integer totalEqScripCount) {
		this.totalEqScripCount = totalEqScripCount;
	}

	public Integer getMatchingEqScripCount() {
		return matchingEqScripCount;
	}

	public void setMatchingEqScripCount(Integer matchingEqScripCount) {
		this.matchingEqScripCount = matchingEqScripCount;
	}

	public List<securityWithPctChange> getSecuritiesWithPctChange() {
		return securitiesWithPctChange;
	}

	public void setSecuritiesWithPctChange(List<securityWithPctChange> securitiesWithPctChange) {
		this.securitiesWithPctChange = securitiesWithPctChange;
	}

}
