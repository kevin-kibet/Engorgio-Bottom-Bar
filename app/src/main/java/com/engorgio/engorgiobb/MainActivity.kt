package com.engorgio.engorgiobb

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.engorgio.engorgiobottombar.ETab
import com.engorgio.engorgiobottombar.EngorgioBottomBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tab1 = ETab(R.drawable.house, "Home",Color.parseColor("#b69bfc"))
        val tab2 = ETab(R.drawable.heart, "Heart", Color.parseColor("#f963d1"))
        val tab3 = ETab(R.drawable.search, "Search",Color.parseColor("#fcbd4c"))
        val tab4 = ETab(R.drawable.avatar, "User", Color.parseColor("#4adcfd"))
        val tablist = arrayListOf(tab1, tab2, tab3, tab4)


        // You can optionally set extras to tabs which you can retrieve back on the tab clicked callback
        val extra = Bundle()
        extra.putString("Key","Value")
        tab1.extra = extra


        engorgioBar.setUserTabs(tablist)
        engorgioBar.setOnTabClickListener(object :EngorgioBottomBar.OnTabClickListener{

            override fun onTabClicked(position: Int, eTab: ETab) {
                //Handle Tab Click Here


            }

        })
    }
}
