package com.tiru.springtest.SpringTest.DAOTest;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAOTester {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate=new JdbcTemplate();
	
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
		System.out.println("This is setter for setDataSource");
		this.dataSource = dataSource;
		System.out.println("Datasource is "+this.dataSource.getClass().getTypeName());
	}


	public String  getModemInstance() {
		
		String modem_manufacturer= null;
		//String modem_manufacturer= null;
		System.out.println("Inside getModemInstance , the datasource is :"+getDataSource());
		jdbcTemplate.setDataSource(getDataSource());
		String sql="select COS_MANUFACTURER from cust_bac_modem_mfg where MFG_ID=75";
		modem_manufacturer = jdbcTemplate.queryForObject(sql, String.class);
		//System.out.println(modem_manufacturer);*/
		return modem_manufacturer ; 
		
	}


}
