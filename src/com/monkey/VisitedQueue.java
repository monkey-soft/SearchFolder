package com.monkey;

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
	private Set<FileTreeNode> visitedQueue = new HashSet<FileTreeNode>();
	
	// 将访问过的文件夹添加到visitedQueue中
	public void addVisitedFolder(FileTreeNode filenode)
	{
		visitedQueue.add(filenode);
	}
	
	// 移除访问过的文件夹
	public void removeVisitedFolder(FileTreeNode filenode)
	{
		visitedQueue.remove(filenode);
	}
	
	// 判断文件上是否在集合中
	public boolean Iscontainment(FileTreeNode filenode)
	{
		return visitedQueue.contains(filenode);
	}
	
	// 判断队列是否为空
	public boolean IsEmpty()
	{
		return visitedQueue.isEmpty();
	}
	
}
