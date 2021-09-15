package com.kh.toy.common.code;

public enum Config {
	
	//DOMAIN("http://pclass.ga"),
	DOMAIN("http://localhast:9090"),
	COMPANY_EMAIL("karte000@gmail.com"),
	SMTP_AUTHENTICATION_ID("karte000@gmail.com"),
	SMTP_AUTHENTICATION_PASSWORD("pclass123!"),
	UPLOAD_PATH("C:\\CODE\\upload\\");

	public final String DESC;
	
	Config(String desc) {
		this.DESC = desc;
	}

	
	
}
