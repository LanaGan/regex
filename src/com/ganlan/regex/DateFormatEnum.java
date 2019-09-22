package com.ganlan.regex;

/**
 * 日期格式类
 * 
 * @author ganlan
 *
 */
public enum DateFormatEnum implements IDateFormat {
	YYYY("yyyy"),
	YYYYMM("yyyyMM"),
	YYYYMMDD("yyyyMMdd"),
	YYYYMM_("yyyy-MM"),
	YYYYMMDD_("yyyy-MM-dd"),
	YYYYMM1("yyyy.MM"),
	YYYYMMDD1("yyyy.MM.dd"),
	YYYYMM2("yyyy/MM"),
	YYYYMMDD3("yyyy/MM/dd"),
	YYYY年("yyyy年"),
	YYYY年MM月("yyyy年MM月"),
	YYYY年MM月DD日("yyyy年MM月dd日");

	private String format = "";

	DateFormatEnum(String format) {
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}
