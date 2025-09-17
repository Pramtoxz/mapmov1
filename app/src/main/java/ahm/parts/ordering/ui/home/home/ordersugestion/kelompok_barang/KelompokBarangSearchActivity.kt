private lateinit var binding: ActivityKelompokBarangSearchStockBinding
package ahm.parts.ordering.ui.home.home.ordersugestion.kelompok_barang

import ahm.parts.ordering.R
import ahm.parts.ordering.helper.setAdapter
import ahm.parts.ordering.ui.base.BaseActivity
import ahm.parts.ordering.ui.home.HomeViewModel
import android.os.Bundle

class KelompokBarangSearchActivity : BaseActivity<HomeViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelompokBarangSearchStockBinding.inflate(layoutInflater)
    setContentView(binding.root)

        initUI()
        initListener()

    }

    private fun initUI() {

        initAdapter()

    }

    private fun initAdapter() {

        var listData = ArrayList<String>()
        listData.add("Pencarian Favorit")
        listData.add("Semua Kelompok Barang")

        rvFavorit.setAdapter(this, listData, R.layout.item_header_kelompok_barang_search, {
            val item = listData[it]

            tvName text item

            var listFavorit = ArrayList<String>()
            listFavorit.add("TR - TIRE")
            listFavorit.add("BR - BRAKE")
            listFavorit.add("BT - BATTERY")

            rvContent.setAdapter(
                this@KelompokBarangSearchActivity,
                listFavorit,
                R.layout.item_content_kelompok_barang_search,
                {
                    val item = listFavorit[it]

                    tvNameSearch.text(item)
                },
                {

                })

        }, {

        })
    }

    private fun initListener() {

    }


}



