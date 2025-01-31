package com.boot.example.mapper;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class DataSourceTests {

	@Setter(onMethod_ = @Autowired)
	private DataSource dataSource;
	
	@Setter(onMethod_ = @Autowired)
	private SqlSessionFactory sqlSessionFactory;
	
	
	@Test
	public void testConnection() {
		try(Connection conn = dataSource.getConnection()){
			log.info(conn.toString());
			log.info("-------------------------------");
			log.info("데이터베이스에 정상적으로 연결되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMybatis() {
		try(SqlSession session = sqlSessionFactory.openSession();
			Connection conn = session.getConnection(); ){
			log.info(session.toString());
			log.info(conn.toString());
			log.info("-------------------------------");
			log.info("Mybatis 연동 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}