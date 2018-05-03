package org.zerock.mappers;

import java.util.List;
import java.util.Map;

import org.zerock.domain.BoardVO;
import org.zerock.util.Criteria;

public interface BbsMapper {

	public int update(BoardVO vo);
	
	public int delete(int i);
	
	public List<BoardVO> list(Criteria cri);
	
	public int insert(BoardVO vo);
	
	public BoardVO read(int i);
	
	public List<BoardVO> listAll();
	
	public int getCount();
	
	public List<BoardVO> search(String string);
	
	public List<BoardVO> searchByCri(Criteria cri);

	
}
