package com.monkey;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author monkey
 * @since 2015-6-24
 *
 */
public class VisitedQueue
{
	// 已经访问的文件夹集合
	private Set<File> visitedQueue = new HashSet<File>();
	
	// 将访问过的文件夹添加到visitedQueue中
	public void addVisitedFolder(File file)
	{
		visitedQueue.add(file);
	}
	
	// 移除访问过的文件夹
	public void removeVisitedFolder(File file)
	{
		visitedQueue.remove(file);
	}
	
	// 判断文件上是否在集合中
	public boolean Iscontainment(File file)
	{
		return visitedQueue.contains(file);
	}
	
	// 判断队列是否为空
	public boolean IsEmpty()
	{
		return visitedQueue.isEmpty();
	}
	
}
