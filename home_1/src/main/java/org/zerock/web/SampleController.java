package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
@Log4j
@Controller
public class SampleController {
	
	private static final Logger logger =
			LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/doA")
	public void doA() {
		
		logger.info("doA called.................");
		log.info("Log4j  : doA ...............");
	}
	@RequestMapping("/doB")
	public void doB() {
		
		logger.info("doB called.................");
		log.info("Log4j  : doB ...............");
		
	}
	@RequestMapping("/doC")
	public String doC(@ModelAttribute("msg") String msg) {
		// ���� ��Ʈ�ѷ����� �޼ҵ��� ���� Ÿ���� ���ڿ��� ����� ����� 
		// '���ڿ� + jsp' ������ ã�Ƽ� �����ϰ� ��
		
		logger.info("doC called..........................");
		
		return "result";
	}
}
