package com.monkey.util;

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
	private static Set<File> visitedQueue = new HashSet<File>();
	
	// 待访问的文件夹集合
	private static FileQueue unVisitedFileQueue = new FileQueue();
	
	// 获取队列
	public static FileQueue getUnVisitedFolder()
	{
		return unVisitedFileQueue;
	}
	
	// 将访问过的文件夹添加到visitedQueue中
	public static void addVisitedFolder(File file)
	{
		visitedQueue.add(file);
	}
	
	// 移除访问过的文件夹
	public static void removeVisitedFolder(File file)
	{
		visitedQueue.remove(file);
	}
	
	// 未访问的文件夹出队列
	public static File unVisitedFolderDeleteQueue()
	{
		return unVisitedFileQueue.RemoveFromQueue();
	}
	
	// 保证每个文件夹只被访问一次
	public static void addUnvisitedFolder(File file)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
