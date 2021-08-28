package app.ourapps.apps_rebuild.ui.seedp.germinasi_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import app.ourapps.apps_rebuild.databinding.ActivityGerminasi1SeedBinding
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.ui.seedp.GerminasiSeedViewModel
import app.ourapps.apps_rebuild.utils.AppRoutes
import app.ourapps.apps_rebuild.utils.menu.MenuClickListener
import app.ourapps.apps_rebuild.utils.menu.MenuListAdapter

class Germinasi1SeedActivity : AppCompatActivity(), MenuClickListener {

    private lateinit var binding: ActivityGerminasi1SeedBinding
    private val germinasiViewModel: GerminasiSeedViewModel by viewModels()
    private val appRoutes = AppRoutes.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGerminasi1SeedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MenuListAdapter()
        adapter.listener = this
        binding.rvMenuDetail.layoutManager = LinearLayoutManager(this)
        binding.rvMenuDetail.adapter = adapter

        germinasiViewModel.listMenuDetail1.observe(this, {
            if (it.isNotEmpty()) {
                adapter.setData(it)
            }
        })

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onItemClicked(view: View, menu: Menu) {
        appRoutes.setDestination(menu.route)
        val routeClass = appRoutes.getRoute()

        if (routeClass != null) {
            val mIntent = Intent(this, routeClass)
            startActivity(mIntent)
        }
    }
}