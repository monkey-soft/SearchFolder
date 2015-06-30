package com.monkey.util;

/**
 * 
 * @author monkey
 * @since 2015-6-24
 */
public class CalculateSpace
{
	/**
	 * 将size转化成以M为单位的数
	 * @param size
	 * @return
	 */
	public static String ChangeIntoM(long size)
	{
		return (size/1024/1024)+"M";
	}
	
	/**
	 * 将size转化成以为G为单位的数
	 * @param size
	 * @return
	 */
	public static String ChangeIntoG(long size)
	{
		return (size/1024/1024/1024)+"G";
	}
}
