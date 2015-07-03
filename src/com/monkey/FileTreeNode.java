package com.monkey;

import java.io.File;

import com.monkey.util.CalculateSpace;

/**
 * 构建新的数据结构:树
 * @author monkey
 * @Date 2015-7-2
 */
public class FileTreeNode
{
	// 节点文件
	private File file;
	
	// 节点等级
	private int rank = 0;
	
	// 节点大小
	private String room;	
	
	// 节点是否是隐藏文件
	private String isHidden;

	// 上级节点
	private FileTreeNode parent;

	// 获取文件的文件名称
	public String getFileName()
	{
		return file.getName();
	}
	
	public File getFile() 
	{
		return file;
	}

	public void setFile(File file)
	{
		this.file = file;
	}

	public int getRank() 
	{
		return rank;
	}

	public void setRank(int rank)
	{
		this.rank = rank;
	}
	
	public String getIsHidden()
	{
		return isHidden;
	}

	// 判断文件是否为隐藏的
	public void setIsHidden(boolean isHidden) 
	{
		if(file.isHidden())
		{
			this.isHidden = "隐藏";
		}
		else
		{
			this.isHidden = "可见";
		}
	}

	public String getRoom() 
	{
		return room;
	}

	// 计算节点的大小
	public void setRoom(File f)
	{
		this.room = CalculateSpace.CalculateFileSpace(f.length(), f);
	}
	
	public FileTreeNode getParent()
	{
		return parent;
	}

	public void setParent(FileTreeNode parent)
	{
		this.parent = parent;
	}
	
}
