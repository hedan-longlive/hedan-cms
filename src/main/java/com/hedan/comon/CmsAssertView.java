package com.hedan.comon;
/**
 * 
 * @author zhaoyiheng
 *
 */
public class CmsAssertView {
	
	/**
	 *  断言处理
	 * @param expression
	 * @param msg
	 */
	public static void Assert(boolean expression,String msg) {
		if(!expression)
			throw new CmsExceptionView(msg);
	}

}
