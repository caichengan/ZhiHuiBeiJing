package com.cca.zhihui.base.newscontentmenu;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.cca.zhihui.base.NewsCenterBaseMenu;

/**
 * 
 *@包名:com.cca.zhihui.base.newscontentmenu
 *@类名:NewsCenterNewsMenu
 *@时间:上午9:36:02
 * @author Administrator
 *@描述:新闻中心页面中专题对应的内容
 */
public class NewsCenterTopicMenu extends NewsCenterBaseMenu
{

	public NewsCenterTopicMenu(Context context) {
		super(context);
	}

	@Override
	protected View initView()
	{
		
		TextView tv=new TextView(mContext);
		tv.setText("专题的内容");
		tv.setTextSize(20);
		tv.setTextColor(Color.RED);
		tv.setGravity(Gravity.CENTER);
		return tv;
	}

	
}
