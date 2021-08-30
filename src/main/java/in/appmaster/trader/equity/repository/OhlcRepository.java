package in.appmaster.trader.equity.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.appmaster.trader.equity.model.Ohlc;

@Repository
public interface OhlcRepository extends CrudRepository<Ohlc, String>, PagingAndSortingRepository<Ohlc, String> {

	// declare custome methods name as per criteria, so that spring data makes implementtaion by its own
	
		public List<Ohlc> getBySymbolIgnoreCaseAndDate(String symbol,LocalDate date);
		public List<Ohlc> getBySymbolIgnoreCase(String symbol);
		public List<Ohlc> findByDateBetween(LocalDate begin,LocalDate end);
		
	
}
