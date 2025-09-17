private lateinit var binding: ActivityNotificationKreditLimitBinding
package ahm.parts.ordering.ui.home.notification.detail

import ahm.parts.ordering.R
import ahm.parts.ordering.ui.base.BaseActivity
import ahm.parts.ordering.ui.home.HomeViewModel
import android.os.Bundle
import android.view.View

class NotificationKreditLimitActivity : BaseActivity<HomeViewModel>(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationKreditLimitBinding.inflate(layoutInflater)
    setContentView(binding.root)

        initUI()
        initListener()

    }

    private fun initUI(){
        setToolbar(getString(R.string.lbl_title_details),true)
    }

    private fun initListener(){

    }

    override fun onClick(v: View?) {
        when(v!!){

        }
    }

}



