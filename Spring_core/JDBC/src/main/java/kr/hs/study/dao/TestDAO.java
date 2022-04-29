package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	
	//jdbcTemplate �ڵ�����
	//���� ���� ����
	@Autowired
	private JdbcTemplate db;
	
	//insert
	public void insertData(TestBean bean) {
		//container�� �ִ� TestBean�� ��ü�� bean�� �ڵ� ����
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
}
