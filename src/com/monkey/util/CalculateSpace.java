package com.monkey.util;

import java.io.File;

/**
 * 
 * @author monkey
 * @since 2015-6-24
 */
public class CalculateSpace
{
	/**
	 * 返回byte的数据大小对应的能一目了然的单位
	 * @param size
	 * @return
	 */
	public static String CalculateFileSpace(long size, File file)
	{
		if(size == 0)
		{
			if(file.isDirectory())
			{
				return "文件夹";
			}
			else
			{
				return "空";
			}
		}
		else if(size < 1024) // byte
		{
			return size+"字节";
		}
		else if(size < 1024*1024) //KB
		{
			return size/1024+"KB";
		}
		else if(size < 1024*1024*1024) // MB
		{
			return size/1024/1024+"MB";
		}
		else // GB
		{
			return size/1024/1024/1024+"GB";
		}
	}
	
}
