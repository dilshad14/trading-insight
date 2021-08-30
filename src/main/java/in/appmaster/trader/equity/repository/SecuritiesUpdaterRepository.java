package in.appmaster.trader.equity.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.appmaster.trader.equity.model.Ohlc;
import in.appmaster.trader.equity.model.Security;


@Repository
public interface SecuritiesUpdaterRepository extends CrudRepository<Security, String>, PagingAndSortingRepository<Security, String> {

	// declare custome methods name as per criteria, so that spring data makes implementtaion by its own
	
		public List<Ohlc> getBySymbol(String symbol);
		public List<Ohlc> getByNameOfCompany(String nameOfCompany);
	
}
