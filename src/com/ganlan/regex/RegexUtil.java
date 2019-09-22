package com.ganlan.regex;

import java.util.regex.Pattern;

/**
 * 常用正则表达式校验工具类
 * 
 * @author ganlan
 *
 */
public final class RegexUtil {

	/**
	 * 匹配数学意义上的数字0 <br/>
	 * eg 0、0.00、0.000 ...、但不包括00、000
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isZero(String value) {
		String regex = RegexConst.ZERO;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验0-9的数字字符<br/>
	 * eg 000033434
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isNum(String value) {
		String regex = RegexConst.NUM;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验自然数（正整数+0）<br/>
	 * eg 自然数由0开始0,1,2,3,4....
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isNaturalNum(String value) {
		String regex = RegexConst.NATURAL_NUM;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验整数（包括负整数，0，正整数）<br/>
	 * eg ...-3,-2,-1,0,1,2,3...
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isInt(String value) {
		String regex = RegexConst.INT;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验正整数（不包括0）<br/>
	 * eg 1,2,3...
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isPositiveInt(String value) {
		String regex = RegexConst.POSITIVE_INT;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验负整数（不包括0）<br/>
	 * eg -1,-2,-3...
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isNegativeInt(String value) {
		String regex = RegexConst.NEGATIVE_INT;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验小数（包括正小数、负小数、包括小数0.0、不包括整数0）<br/>
	 * eg -0.000,23.3244
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isDecimal(String value) {
		String regex = RegexConst.DECIMAL;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验小数（包括正小数、负小数、包括小数0.0、不包括整数0）<br/>
	 * 
	 * @param value 校验的字符串
	 * @param scale 保留的小数位数（<i>如果scale小于1会抛出 RegexScaleException异常</i>）
	 * @return
	 */
	public static boolean isDecimal(String value, int scale) {
		checkScale(scale);
		String regex = RegexConst.DECIMAL.replace("d{1,}", "d{" + scale + "}");
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验正小数（包括小数0.0、不包括整数0）<br/>
	 * eg 0.000,23.3244
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isPositiveDecimal(String value) {
		String regex = RegexConst.POSITIVE_DECIMAL;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验指定小数位数的正小数（包括小数0.0、不包括整数0）<br/>
	 * eg 0.000,23.3244
	 * 
	 * @param value 校验的字符串
	 * @param scale 保留的小数位数（<i>如果scale小于1会抛出 RegexScaleException异常</i>）
	 * @return
	 */
	public static boolean isPositiveDecimal(String value, int scale) {
		checkScale(scale);
		String regex = RegexConst.POSITIVE_DECIMAL.replace("d{1,}", "d{" + scale + "}");
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验负小数（包括小数0.0、不包括整数0）<br/>
	 * eg -0.000,-23.3244
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isNegativeDecimal(String value) {
		String regex = RegexConst.NEGATIVE_DECIMAL;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验指定小数位数的负小数（包括小数0.0、不包括整数0）<br/>
	 * eg -0.000,-23.3244
	 * 
	 * @param value 校验的字符串
	 * @param scale 保留的小数位数（<i>如果scale小于1会抛出 RegexScaleException异常</i>）
	 * @return
	 */
	public static boolean isNegativeDecimal(String value, int scale) {
		checkScale(scale);
		String regex = RegexConst.NEGATIVE_DECIMAL.replace("d{1,}", "d{" + scale + "}");
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验在0-1之间的数（包括小数0.0、不包括整数0）<br/>
	 * eg 0.00,0.9999
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isBetween0And1(String value) {
		String regex = RegexConst.BETWEEN_0_AND_1;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验中文字符<br/>
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isOnlyChinese(String value) {
		String regex = RegexConst.ONLY_CHINESE;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验存在中文字符<br/>
	 * 
	 * @param value 校验的字符串
	 * @return
	 */
	public static boolean isExistChinese(String value) {
		String regex = RegexConst.EXIST_CHINESE;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验字母（包括大小写）<br/>
	 * 
	 * @param value 校验的字符串
	 */
	public static boolean isLetter(String value) {
		String regex = RegexConst.LETTER;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验大写字母<br/>
	 * 
	 * @param value 校验的字符串
	 */
	public static boolean isUppercaseLetter(String value) {
		String regex = RegexConst.UPPERCASE_LETTER;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验小写字母<br/>
	 * 
	 * @param value 校验的字符串
	 */
	public static boolean isLowercaseLetter(String value) {
		String regex = RegexConst.LOWERCASE_LETTER;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验数字、字母<br/>
	 * eg 0033zzz,RRR0002323
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNumOrLetter(String value) {
		String regex = RegexConst.NUM_OR_LETTER;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验数字、字母、下划线<br/>
	 * eg 0033zzz,RRR0002323
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNumOrLetterOrUnderline(String value) {
		String regex = RegexConst.NUM_OR_LETTER_OR_UNDERLINE;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验非数字、非字母、非下划线<br/>
	 * eg @#$%^,%^&*{}
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNotNumOrLetterOrUnderline(String value) {
		String regex = RegexConst.NOT_NUM_OR_LETTER_OR_UNDERLINE;
		return Pattern.matches(regex, value);
	}

	/**
	 * 校验日期字符串是否时指定的日期格式类型
	 * 
	 * @param dateStr    日期字符串
	 * @param dateFormat 指定的日期格式类型
	 * @return
	 */
	public static boolean isDate(String dateStr, IDateFormat dateFormat) {
		String regexFormat = dateFormat.getFormat();
		return Pattern.matches(regexFormat, dateStr);
	}

	/**
	 * 校验小数位数是否正确
	 * 
	 * @param scale
	 */
	private static void checkScale(int scale) {
		if (scale < 1) {
			throw new RegexScaleException("至少保留1位小数以上");
		}
	}
}