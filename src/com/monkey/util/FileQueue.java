package com.monkey.util;

import java.io.File;
import java.util.LinkedList;

/**
 * 文件队列,保存所遍历的文件
 * @author monkey
 * @since 2015-6-24
 */
public class FileQueue 
{
	// 使用链表来构建队列
	private LinkedList<File> filequeues = new LinkedList<File>();
	
	/**
	 * 加入队列
	 * @param file
	 */
	public void AddToQueue(File file)
	{
		filequeues.addLast(file);
	}
	
	/**
	 * 添加一个File数组到队列中
	 * @param files
	 */
	public void AddFileListToQueue(File[] files)
	{
		for(File file : files)
		{
			AddToQueue(file);
		}
	}
	
	public String FileQueueLength()
	{
		return filequeues.size()+"个文件夹";
	}

	/**
	 * 出队列
	 * @return
	 */
	public File RemoveFromQueue()
	{
		return filequeues.removeFirst();
	}
	
	/**
	 * 判断队列是否为空
	 * @return
	 */
	public boolean IsEmpty()
	{
		return filequeues.isEmpty();
	}
	
	/**
	 * 判断队列中是否包含了file
	 * @param file
	 * @return
	 */
	public boolean ContainFile(File file)
	{
		return filequeues.contains(file);
	}
	
}
