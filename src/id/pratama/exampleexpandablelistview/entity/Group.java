/*
 * Pratama Nur Wijaya (c) 2013 
 * 
 * Project       : ExampleExpandableListview
 * Filename      : Group.java
 * Creation Date : Jul 29, 2013 time : 10:03:29 PM
 *
 */

package id.pratama.exampleexpandablelistview.entity;

import java.util.List;

public class Group
{
	private int					_id;
	private String				name;
	private List<ItemDetail>	itemList;

	public Group(String name, List<ItemDetail> itemList)
	{
		this.name = name;
		this.itemList = itemList;
	}

	public int get_id()
	{
		return _id;
	}

	public void set_id(int _id)
	{
		this._id = _id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<ItemDetail> getItemList()
	{
		return itemList;
	}

	public void setItemList(List<ItemDetail> itemList)
	{
		this.itemList = itemList;
	}

}
