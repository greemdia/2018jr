package org.zerock.dao;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mappers.BbsMapper;
import org.zerock.mappers.TimeMapper;
import org.zerock.util.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	@Setter(onMethod_= {@Autowired})
	DataSource ds;
	
	@Setter(onMethod_= {@Autowired})
	TimeMapper time;
	
	@Setter(onMethod_= {@Autowired})
	BbsMapper mapper;
	
	@Test
	public void timeTest() {
		log.info(time);
	}
	@Test
	public void dsTest() {
		log.info(ds);
	}
	
	@Test
	public void BbsTest() {
		log.info("Bbs �����Դϴ�...." + mapper);
	}
	
	@Test
	public void testInsert() {
		for(int i=0; i<10; i++) {
			BoardVO vo = new BoardVO();
			
			vo.setTitle("�׽�Ʈ����6" + i);
			vo.setContent("�׽�Ʈ�۳���6" + i);
			vo.setWriter("ȸ��6");
			
			log.info("insert �׽�Ʈ��...." + mapper.insert(vo));		
		}
	}
	@Test
	public void testSelect() {
		log.info("select �׽�Ʈ ��...." + mapper.read(1));
	}
	@Test
	public void testUpdate() {
		BoardVO vo = mapper.read(11);
		vo.setTitle("Update Title");
		vo.setContent("�׽�Ʈ ���Դϴ�..");
		
		log.info("update �׽�Ʈ ��...." + mapper.update(vo));	
	}
	@Test
	public void testDel() {
		log.info("delete �׽�Ʈ ��...." + mapper.delete(9));
	}
	@Test
	public void testList() {
		mapper.list(new Criteria(1)).forEach(vo -> log.info(vo));
	}
	@Test
	public void testSearch() {
		mapper.searchByCri(new Criteria(1)).forEach(vo -> log.info(vo));
	}	
}
