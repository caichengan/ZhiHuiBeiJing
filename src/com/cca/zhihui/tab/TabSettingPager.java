package com.cca.zhihui.tab;

import com.cca.zhihui.base.TabBasePager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/**
 * 
 *@包名:com.cca.zhihui.baseactivity
 *@类名:TabHomePager
 *@时间:下午5:08:06
 * @author Administrator
 *@描述:这是tab对应的设置界面
 */
public class TabSettingPager extends TabBasePager
{

	public TabSettingPager(Context context) {
		super(context);
	}
	
	@Override
	public void initData()
	{
		//1、设置标题内容
		mTextView.setText("设置界面");
		mIvMenu.setVisibility(View.GONE);
		
		//2、设置内容区域数据
		TextView tv=new TextView(mContext);
		tv.setText("设置界面区域");
		tv.setTextColor(Color.RED);
		tv.setGravity(Gravity.CENTER);
		
		LayoutParams params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		mContentContainer.addView(tv,params);
		
	}

}
