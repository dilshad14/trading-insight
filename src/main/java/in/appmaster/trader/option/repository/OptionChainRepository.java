package in.appmaster.trader.option.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import in.appmaster.trader.option.model.OptionChainScreen;

public interface OptionChainRepository extends CrudRepository<OptionChainScreen, Long>,PagingAndSortingRepository<OptionChainScreen, Long> {

// declare custome methods name as per criteria, so that spring data makes implementtaion by its own
	
	public OptionChainScreen getByAsOnScreenDateTime(LocalDateTime asOnScreenDateTime);
	public OptionChainScreen getByfetchDateTime(LocalDateTime fetchDateTime);
	
	public List<OptionChainScreen>  getBySymbol(String scripSymbol);
}
