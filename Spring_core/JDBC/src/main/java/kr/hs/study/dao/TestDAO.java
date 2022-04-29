package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	
	//jdbcTemplate 자동주입
	//실제 쿼리 수행
	@Autowired
	private JdbcTemplate db;
	
	//insert
	public void insertData(TestBean bean) {
		//container에 있는 TestBean의 객체가 bean에 자동 주입
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
}
