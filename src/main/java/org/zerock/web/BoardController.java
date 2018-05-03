package org.zerock.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.BoardVO;
import org.zerock.mappers.BbsMapper;
import org.zerock.util.Criteria;

import lombok.extern.log4j.Log4j;
@CrossOrigin
@RequestMapping("/board/*")
@Log4j
@Controller
public class BoardController {
	
	private BbsMapper mapper;
	
	public BoardController(BbsMapper mapper) {
		this.mapper = mapper;
	}
	
/*	@GetMapping("/list")
	public void list() {
		log.info("get list.....");
	}
	*/
	/*@GetMapping("/{bno}")
	public ResponseEntity<BoardVO> read(@PathVariable("bno") Integer bno){
		return new ResponseEntity<BoardVO>(mapper.read(bno),HttpStatus.OK);
	}*/
	
	@GetMapping("/list/{page}")
	public ResponseEntity<List<BoardVO>> list(Criteria cri){
		log.info("cri: " + cri);
		return new ResponseEntity<List<BoardVO>>(mapper.list(cri),HttpStatus.OK);
	}
	
	
}
