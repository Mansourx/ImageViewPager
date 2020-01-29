package com.example.imageviewpager

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.slider_image_item.view.*

/**
 * Created by ahmad Mansour on 29,January,2020
 */

class ImageSliderAdapter: PagerAdapter{

    var context: Context? = null
    var images: Array<Int>

    lateinit var layoutInflater: LayoutInflater

    constructor(context: Context, images: Array<Int>) {
        this.context = context
        this.images = images
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as RelativeLayout
    }

    override fun getCount(): Int =  images.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var image: ImageView
        layoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view: View = layoutInflater.inflate(R.layout.slider_image_item,container, false)
        image = view.image_item
        image.setBackgroundResource(images[position])
        container.addView(view)
        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }

}