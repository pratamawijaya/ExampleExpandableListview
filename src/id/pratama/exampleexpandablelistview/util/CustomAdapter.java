/*
 * Pratama Nur Wijaya (c) 2013 
 * 
 * Project       : ExampleExpandableListview
 * Filename      : CustomAdapter.java
 * Creation Date : Jul 29, 2013 time : 9:30:01 PM
 *
 */

package id.pratama.exampleexpandablelistview.util;

import id.pratama.exampleexpandablelistview.R;
import id.pratama.exampleexpandablelistview.entity.Group;
import id.pratama.exampleexpandablelistview.entity.ItemDetail;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Adapter class untuk Expandable List
 * 
 * @author pratama
 * 
 */
public class CustomAdapter extends BaseExpandableListAdapter
{

	public LayoutInflater	mInflater;
	private List<Group>		mGroup;

	/**
	 * Main Constructor Class {@link CustomAdapter}
	 * 
	 * @param context
	 *            context system
	 * @param group
	 *            List group
	 */
	public CustomAdapter(Context context, List<Group> group)
	{
		mInflater = LayoutInflater.from(context);
		mGroup = group;
	}

	@Override
	public Object getChild(int groupPos, int childPos)
	{
		return mGroup.get(groupPos).getItemList().get(childPos);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition)
	{
		return mGroup.get(groupPosition).getItemList().get(childPosition).get_id();
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent)
	{
		View v = convertView;
		if (v == null)
			v = mInflater.inflate(R.layout.child, null);

		TextView childName = (TextView) v.findViewById(R.id.childName);

		ItemDetail itemDetail = mGroup.get(groupPosition).getItemList().get(childPosition);

		childName.setText(itemDetail.getName());

		return v;
	}

	@Override
	public int getChildrenCount(int groupPosition)
	{
		return mGroup.get(groupPosition).getItemList().size();
	}

	@Override
	public Object getGroup(int groupPosition)
	{
		return mGroup.get(groupPosition);
	}

	@Override
	public int getGroupCount()
	{
		return mGroup.size();
	}

	@Override
	public long getGroupId(int groupPosition)
	{
		return mGroup.get(groupPosition).get_id();
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
	{
		View v = convertView;
		if (v == null)
			v = mInflater.inflate(R.layout.root, null);

		TextView group = (TextView) v.findViewById(R.id.root);

		Group gr = mGroup.get(groupPosition);

		group.setText(gr.getName());
		return v;
	}

	@Override
	public boolean hasStableIds()
	{
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition)
	{
		return false;
	}

}
