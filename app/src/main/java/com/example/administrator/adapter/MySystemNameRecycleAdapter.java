package com.example.administrator.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.bean.SystemNameBean;
import com.example.administrator.testapk.R;
import com.example.administrator.view.AtyAddMsg;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取系统名称界面时的recyclerView
 */
public class MySystemNameRecycleAdapter extends RecyclerView.Adapter<MySystemNameRecycleAdapter.ViewHolder> implements View.OnClickListener{

    private List<SystemNameBean.DataBean> mData;
    private Context context;

    public MySystemNameRecycleAdapter(Context context, ArrayList<SystemNameBean.DataBean> mDatas) {
        this.context = context;
        mData = mDatas;
    }

//    public void setData(List<String> data) {
//        mData = data;
//    }

    private OnItemClickListener mOnItemClickListener = null;

    //define interface
    public static interface OnItemClickListener {
        void onItemClick(View view , int position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_systemname_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(view);
        //将创建的View注册点击事件
        view.setOnClickListener(this);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.mTextView.setText(mData.get(position).getSystemName());
        //将position保存在itemView的Tag中，以便点击时进行获取
        viewHolder.itemView.setTag(position);
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取position
            mOnItemClickListener.onItemClick(v,(int)v.getTag());
        }
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0:mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView)view.findViewById(R.id.text_content);
        }
    }
}
