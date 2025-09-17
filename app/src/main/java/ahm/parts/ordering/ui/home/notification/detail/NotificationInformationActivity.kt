private lateinit var binding: ActivityNotificationInformationDetailBinding
package ahm.parts.ordering.ui.home.notification.detail

import ahm.parts.ordering.R
import ahm.parts.ordering.data.constant.Constants
import ahm.parts.ordering.data.model.notification.Information
import ahm.parts.ordering.helper.extra
import ahm.parts.ordering.helper.getObject
import ahm.parts.ordering.helper.htmlTextLoad
import ahm.parts.ordering.ui.base.BaseActivity
import ahm.parts.ordering.ui.home.HomeViewModel
import ahm.parts.ordering.ui.home.notification.NotificationViewModel
import android.os.Bundle
import android.view.View

class NotificationInformationActivity : BaseActivity<NotificationViewModel>(), View.OnClickListener {

    lateinit var notificationInfo : Information

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationInformationDetailBinding.inflate(layoutInflater)
    setContentView(binding.root)

        initUI()
        initListener()

    }

    private fun initUI(){
        setToolbar(getString(R.string.lbl_title_details),true)

        notificationInfo = extra(Constants.BUNDLE.JSON).getObject()

        tvTitleNotif text notificationInfo.name

        webView htmlTextLoad notificationInfo.description
    }

    private fun initListener(){

    }

    override fun onClick(v: View?) {
        when(v!!){

        }
    }

}



