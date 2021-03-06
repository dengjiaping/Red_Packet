package com.haoxiong.taotao.ui.redpacket.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.fan.service.response.RedOwerResponse;
import com.fan.service.response.RedPacketDetailResponse;
import com.haoxiong.taotao.R;
import com.haoxiong.taotao.util.GlideUtil;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 类描述：
 * 作者： YinJin
 * 创建时间：2017/9/10.0:29
 */

public class RecycleRedPacketWinerAdapter extends BaseQuickAdapter<RedOwerResponse.DataBean, BaseViewHolder> {
    Context context;

    public RecycleRedPacketWinerAdapter(@LayoutRes int layoutResId, Context context, @Nullable List<RedOwerResponse.DataBean> data) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper,RedOwerResponse.DataBean item) {
        if (getData().indexOf(item) == 0) {
            helper.setVisible(R.id.tv_item_red_money_pic, true);
        } else {
            helper.setVisible(R.id.tv_item_red_money_pic, false);
        }
        helper.setText(R.id.tv_item_red_name, item.getUserName());
        helper.setText(R.id.tv_item_red_add, item.getAddress());
        helper.setText(R.id.tv_item_red_time, item.getGetTime());
        helper.setText(R.id.tv_item_red_money, item.getMoney() + "元");
        CircleImageView img_item_red_pic = (CircleImageView) helper.getView(R.id.img_item_red_pic);
        GlideUtil.loadImg(context, R.mipmap.head, item.getUserPic(), img_item_red_pic);
    }

}
