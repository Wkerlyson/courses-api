package com.course.module.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class TransactionManagerConfig {

	@Bean(name = "chainedTransactionManager")
	public ChainedTransactionManager transactionManager(
			@Qualifier("postgresDSTransactionManager") PlatformTransactionManager pgsqlTransactionManager,
			@Qualifier("sqlServerDSTransactionManager")PlatformTransactionManager sqlServerTransactionManager) {
		
		return new ChainedTransactionManager(sqlServerTransactionManager, pgsqlTransactionManager);
	}
}
