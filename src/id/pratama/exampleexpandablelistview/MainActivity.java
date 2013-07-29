package id.pratama.exampleexpandablelistview;

import id.pratama.exampleexpandablelistview.entity.Group;
import id.pratama.exampleexpandablelistview.entity.ItemDetail;
import id.pratama.exampleexpandablelistview.util.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.ExpandableListActivity;
import android.view.Menu;

public class MainActivity extends ExpandableListActivity
{
	private List<Group>			mListGroup;
	private List<ItemDetail>	mListTeamJ;
	private List<ItemDetail>	mListTeamK3;
	private CustomAdapter		mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setDummyData();

		mAdapter = new CustomAdapter(this, mListGroup);

		getExpandableListView().setAdapter(mAdapter);

	}

	/**
	 * Masukkan dummy data
	 */
	private void setDummyData()
	{
		mListGroup = new ArrayList<Group>();
		mListTeamJ = new ArrayList<ItemDetail>();
		mListTeamK3 = new ArrayList<ItemDetail>();

		mListTeamJ.add(new ItemDetail("Aki Takajo"));
		mListTeamJ.add(new ItemDetail("Ayana Shahab"));

		mListTeamK3.add(new ItemDetail("Alicia Chanzia"));
		mListTeamK3.add(new ItemDetail("Cindy Yuvia"));

		mListGroup.add(new Group("Team J", mListTeamJ));
		mListGroup.add(new Group("Team KIII", mListTeamK3));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
