private lateinit var binding: ActivityPreviewImageBinding
package ahm.parts.ordering.ui.previewimage

import ahm.parts.ordering.R
import ahm.parts.ordering.data.constant.Constants
import ahm.parts.ordering.helper.extra
import ahm.parts.ordering.helper.loadImage
import ahm.parts.ordering.helper.statusBarChange
import ahm.parts.ordering.ui.base.BaseActivity
import ahm.parts.ordering.ui.home.HomeViewModel
import android.os.Bundle
import android.view.View

class PreviewImageActivity : BaseActivity<HomeViewModel>(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewImageBinding.inflate(layoutInflater)
    setContentView(binding.root)

        initUI()
        initListener()

    }

    private fun initUI(){
        setToolbar(getString(R.string.lbl_title_preview_image),true)

        val imagePhoto = extra(Constants.BUNDLE.PHOTO)

        ivImage.loadImage(imagePhoto,pbLoading)
    }

    private fun initListener(){

    }

    override fun onClick(v: View?) {
        when(v!!){

        }
    }

}



