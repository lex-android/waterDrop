package com.drops.waterdrop.ui.store.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.drops.waterdrop.R;
import com.drops.waterdrop.ui.find.activity.CommonWebActivity;
import com.drops.waterdrop.ui.find.activity.GoodsDetailsActivity;
import com.drops.waterdrop.widget.storebanner.holder.MZViewHolder;
import com.netease.nim.uikit.Constants;
import com.netease.nim.uikit.common.util.GlideUtil;
import com.netease.nim.uikit.model.BrandListEntity;

/**
 * Created by Mr.Smile on 2017/9/12.
 */

public class InnerBannerViewHolder implements MZViewHolder<BrandListEntity.BannersBean> {
    private ImageView mImageView;

    @Override
    public View createView(Context context) {
        // 返回页面布局
        View view = LayoutInflater.from(context).inflate(R.layout.inner_pager_item, null);
        mImageView = (ImageView) view.findViewById(R.id.iv_bg);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return view;
    }

    @Override
    public void onBind(final Context context, int position, final BrandListEntity.BannersBean data) {
        if (data.getPhotos() != null && data.getPhotos().size()>0) {
            GlideUtil.showImageView(context, R.drawable.img_qs_375x207, data.getPhotos().get(0), mImageView);
        }
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.getType() == 1) {
                    GoodsDetailsActivity.start(context, data.getGoodId(), Constants.STORE_TIP_ID, Constants.STORE_DROP_ID, Constants.STORE_TIP_TITLE);
                } else if (data.getType() == 2){
                    String link = data.getLink();
                    CommonWebActivity.startOfActive(context, link);
                } else if (data.getType() == 3) {
                    String link = data.getLink();
                    String tipId = link.substring(link.indexOf("=") + 1).trim();
                    CommonWebActivity.start(context, Long.parseLong(tipId), link);
                }
            }
        });
    }
}