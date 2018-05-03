package org.zerock.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO {
	
	private String uid;
	private String upw;
	private String uname;
	private Date regdate;
}
