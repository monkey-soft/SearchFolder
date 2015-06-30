package com.monkey;

import java.io.File;

import com.monkey.util.CalculateSpace;

/**
 * 
 * @author monkey
 * @since 2015-6-24
 */
public class main 
{
	private static String fileStr = "E:\\";
	
	
	public static void main(String[] args)
	{
		File file = new File(fileStr);
		
		if(file.isDirectory())
		{
			// 文件的绝对路径
			System.out.println(file.getAbsolutePath());
			
			// 判断文件的大小,以G为单位
			System.out.println(CalculateSpace.ChangeIntoG(file.getTotalSpace()));
			
			File[] files = file.listFiles();
			
			System.out.println(files.length);
			
			for(File f : files)
			{
				System.out.println(f.getName());
			}
		}
	}

}
