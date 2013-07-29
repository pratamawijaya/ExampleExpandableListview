/*
 * Pratama Nur Wijaya (c) 2013 
 * 
 * Project       : ExampleExpandableListview
 * Filename      : ItemDetail.java
 * Creation Date : Jul 29, 2013 time : 10:04:10 PM
 *
 */

package id.pratama.exampleexpandablelistview.entity;

public class ItemDetail
{

	private int		_id;
	private String	name;
	private String	desc;

	public ItemDetail(String name)
	{
		this.name = name;
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

	public String getDesc()
	{
		return desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

}
