package com.monkey;

import java.io.File;

import com.monkey.util.CalculateSpace;
import com.monkey.util.CalculateTime;

/**
 * 
 * @author monkey
 * @since 2015-6-24
 */
public class CrawlFolder 
{
	private static String fileStr = "E:\\";  //"E:\\爱情公寓"; // "E:\\";  
	
	// 访问过的文件夹的集合
	private static VisitedQueue visitedQueue = new VisitedQueue();
	
	// 待访问的文件夹的队列
	private static FileQueue fileQueue = new FileQueue();
	
	/**
	 * 遍历文件夹
	 */
	public void TraversalFolders()
	{
		File root = new File(fileStr);
		FileTreeNode filenode = new FileTreeNode();
		filenode.setFile(root);
		filenode.setIsHidden(root.isHidden());
		filenode.setRank(1);
		filenode.setRoom(root);
		filenode.setParent(filenode);
		
		showRootFolderInfo(root);
		
		// 是文件夹就向下遍历,否则跳出
		if(root.isDirectory())
		{
			fileQueue.AddToQueue(filenode);
		}
		else
		{
			return;
		}
		
		while(!fileQueue.IsEmpty())
		{
			FileTreeNode fn = fileQueue.RemoveFromQueue();
			
			// 已经遍历过的文件直接跳过
			if(visitedQueue.Iscontainment(fn))
			{
				return ;
			}
			
			if(fn.getFile().isDirectory())
			{
				fileQueue.AddFileListToQueue(fn.getFile().listFiles(), fn);
			}
			
			showFolderInfo(fn);
		}
	}

	
	/**
	 * 输出根目录的相关信息
	 * @param file
	 */
	public void showRootFolderInfo(File root)
	{
		// 文件的绝对路径
		System.out.println("绝对路径: " + root.getAbsolutePath());
		
		// 文件的储存空间
		System.out.println("内存空间: " + CalculateSpace.CalculateFileSpace(root.getTotalSpace(), root));
	}
	
	/**
	 * 输出文件夹相关的信息
	 */
	public void showFolderInfo(FileTreeNode filenode)
	{
		// 等级越高就输出越多个空格
		for(int i=1; i<filenode.getRank(); i++)
		{
			System.out.print("==|");
		}
		
		// 输出文件名称
		System.out.print(filenode.getFileName());  
		
		// 输出文件的等级
		System.out.print("[第" + filenode.getRank() + "级");
		
		// 输出文件是否为隐藏的
		System.out.print(" - " + filenode.getIsHidden());

		//  输出文件的大小
		System.out.print(" - " + filenode.getRoom() + "]");
		
		// 输出上级目录
		System.out.println(" [上级目录:" + filenode.getParent().getFile().getName() + "]");
	}
	
	public static void main(String[] args)
	{
		// 记录开始遍历的时间
		long starttime = System.currentTimeMillis();
		
		CrawlFolder crawlfolder = new CrawlFolder();
		crawlfolder.TraversalFolders();
		
		long endtime = System.currentTimeMillis();
		
		System.out.println(CalculateTime.CalculateraversalTime(endtime-starttime));
		
	}

}
