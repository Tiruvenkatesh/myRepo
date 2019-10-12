package com.tiru.springtest.SpringTest.DAOTest;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAOTester {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public String  getModemInstance() {
		String modem_manufacturer= null;
		jdbcTemplate.setDataSource(getDataSource());

		String sql="select COS_MODEL,COS_MANUFACTURER from cust_bac_modem_mfg where MFG_ID=75";
		modem_manufacturer = jdbcTemplate.queryForObject(sql, String.class);
		//System.out.println(modem_manufacturer);
		return modem_manufacturer ;
		
	}
}
