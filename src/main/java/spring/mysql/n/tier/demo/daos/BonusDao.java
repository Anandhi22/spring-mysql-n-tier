package spring.mysql.n.tier.demo.daos;

import java.sql.SQLException;
import java.util.List;

import spring.mysql.n.tier.demo.models.Worker;

public interface BonusDao {
	
	
		
		// Read/Retrieve Operations
		Worker findWorkerBonusById(Integer id) throws SQLException;
		
		//List of Bonus
		List<Worker> findAllWorkersBonus() throws SQLException;
		
		// Update Operations
		Integer updateWorkerBonus(Worker worker) throws SQLException;
		
		
	

}
