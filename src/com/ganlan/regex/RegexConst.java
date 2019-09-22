package com.ganlan.regex;

/**
 * 常用正则表达式常量类
 * 
 * @author ganlan
 *
 */
public final class RegexConst {

	/** 匹配数学意义上的数字0 （包括0、0.00、0.000 ...、但不包括00、000） **/
	public static final String ZERO = "^0$|^0\\.[0]{1,}$";

	/** 匹配0-9的数字字符（只判断是否是数字字符） **/
	public static final String NUM = "^\\d*$";

	/** 匹配数字字符、字母 */
	public static final String NUM_OR_LETTER = "^[A-Za-z0-9]+$";

	/** 匹配数字字符、字母、下划线 */
	public static final String NUM_OR_LETTER_OR_UNDERLINE = "^\\w+$";

	/** 匹配非数字字符、非字母、非下划线 */
	public static final String NOT_NUM_OR_LETTER_OR_UNDERLINE = "^\\W+$";

	/** 匹配自然数（正整数+0） */
	public static final String NATURAL_NUM = "^0$|^[1-9]\\d*$";

	/** 匹配整数（包括负整数，0，正整数） */
	public static final String INT = "^-?[1-9]\\d*$|^0$";

	/** 匹配正整数（不包括0）） */
	public static final String POSITIVE_INT = "^[1-9]\\d*$";

	/** 匹配负整数（不包括0） */
	public static final String NEGATIVE_INT = "^-[1-9]\\d*$";

	/** 匹配整数、小数（包括正整数、负整数、正小数、负小数、0） */
	public static final String INT_OR_DECIMAL = "^-[1-9]\\d*$";

	/** 匹配小数（包括正小数、负小数、包括小数0.0、不包括整数0） */
	public static final String DECIMAL = "^-?0\\.\\d{1,}$|^-?[1-9]\\d*\\.\\d{1,}$";

	/** 匹配正小数（包括小数0.0、不包括整数0） */
	public static final String POSITIVE_DECIMAL = "^0\\.\\d{1,}$|^[1-9]\\d*\\.\\d{1,}$";

	/** 匹配负小数（包括小数0.0、不包括整数0） */
	public static final String NEGATIVE_DECIMAL = "^-0\\.\\d{1,}$|^-[1-9]\\d*\\.\\d{1,}$";

	/** 匹配在0-1之间的数（包括小数0.0、不包括整数0） */
	public static final String BETWEEN_0_AND_1 = "^0\\.\\d+$|^0$";

	/** 匹配中文字符 */
	public static final String ONLY_CHINESE = "^[\\u4e00-\\u9fa5]+$";

	/** 匹配存在中文字符 */
	public static final String EXIST_CHINESE = "[\\u4e00-\\u9fa5]";

	/** 匹配字母（包括大小写） */
	public static final String LETTER = "^[a-zA-Z]+$";

	/** 匹配大写字母 */
	public static final String UPPERCASE_LETTER = "^[A-Z]+$";

	/** 匹配小写字母 */
	public static final String LOWERCASE_LETTER = "^[a-z]+$";
}