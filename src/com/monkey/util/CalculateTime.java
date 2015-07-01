package com.monkey.util;

/**
 * 
 * @author monkey
 * @since 2015-7-1
 */
public class CalculateTime
{
	public static String CalculateTime(long time)
	{
		if(time < 3600)
		{
			return "花费"+time+"毫秒";
		}
		else if(time < 3600*3600)
		{
			return "花费"+time/3600+"秒";
		}
		else
		{
			return "花费"+time/3600/3600+"分钟";
		}
	}
}
