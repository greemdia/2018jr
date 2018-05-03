package org.zerock.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mappers.BbsMapper;
import org.zerock.util.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SearchTests {

	@Setter(onMethod_= {@Autowired})
	BbsMapper mapper;
	
	@Test
	public void testSearchByCri() {
		
		Criteria cri = new Criteria();
		cri.setPage(1);
		cri.setKeyword("tcw");
		
		log.info(mapper.searchByCri(cri));
	}
	@Test
	public void testSearchByCri2() {
		Criteria cri = new Criteria();
		cri.setKeyword("t");
		
		log.info(mapper.searchByCri(cri));
	}
	@Test
	public void testSearch() {
		Criteria cri = new Criteria();
		//cri.setKeyword("w");
		log.info("search 테스트 중....." + mapper.search("t"));
	}

}
