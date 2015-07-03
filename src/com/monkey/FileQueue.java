package com.monkey;

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
	private LinkedList<FileTreeNode> filequeue = new LinkedList<FileTreeNode>();
	
	/**
	 * 加入队列
	 * @param filenode
	 */
	public void AddToQueue(FileTreeNode filenode)
	{
		filequeue.addLast(filenode);
	}
	
	/**
	 * 添加一个File数组到队列中
	 * @param files
	 */
	public void AddFileListToQueue(File[] files, FileTreeNode fn)
	{
		FileTreeNode filenode;
		
		for(File file : files)
		{
			if(file.canRead() && !file.getName().equals("$RECYCLE.BIN")
					&& !file.getName().equals("RECYCLER")
					&& !file.getName().equals("System Volume Information"))
			{
				filenode = new FileTreeNode();     // 每次都new一次,不知道会不会很影响性能
				filenode.setFile(file);
				filenode.setIsHidden(file.isHidden());
				filenode.setParent(fn);
				filenode.setRank(fn.getRank()+1);
				filenode.setRoom(file);
				
				AddToQueue(filenode);
			}
		}
	}
	
	
	public String FileQueueLength()
	{
		return filequeue.size()+"个文件";
	}

	/**
	 * 出队列
	 * @return
	 */
	public FileTreeNode RemoveFromQueue()
	{
		return filequeue.removeFirst();
	}
	
	
	/**
	 * 判断队列是否为空
	 * @return
	 */
	public boolean IsEmpty()
	{
		return filequeue.isEmpty();
	}
	
	/**
	 * 判断队列中是否包含了filenode
	 * @param filenode
	 * @return
	 */
	public boolean ContainFile(FileTreeNode filenode)
	{
		return filequeue.contains(filenode);
	}
	
	
//	public void show(File[] files)
//	{
//		for(File f:files)
//		{
//			System.out.println(f.getName());
//		}
//	}
}
