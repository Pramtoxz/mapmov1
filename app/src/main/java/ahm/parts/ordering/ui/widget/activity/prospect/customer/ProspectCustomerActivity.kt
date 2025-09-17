private lateinit var binding: ActivityProspectCustomerBinding
package ahm.parts.ordering.ui.widget.activity.prospect.customer

import ahm.parts.ordering.R
import ahm.parts.ordering.ui.base.BaseActivity
import ahm.parts.ordering.ui.widget.activity.prospect.ProspectViewModel
import android.os.Bundle

class ProspectCustomerActivity : BaseActivity<ProspectViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProspectCustomerBinding.inflate(layoutInflater)
    setContentView(binding.root)
    }
}



