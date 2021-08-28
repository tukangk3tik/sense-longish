package app.ourapps.apps_rebuild.ui.seedp.germinasi_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import app.ourapps.apps_rebuild.databinding.ActivityGerminasi2SeedBinding
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.ui.seedp.GerminasiSeedViewModel
import app.ourapps.apps_rebuild.utils.AppRoutes
import app.ourapps.apps_rebuild.utils.menu.MenuClickListener
import app.ourapps.apps_rebuild.utils.menu.MenuListAdapter

class Germinasi2SeedActivity : AppCompatActivity(), MenuClickListener {

    private lateinit var binding: ActivityGerminasi2SeedBinding
    private val germinasiViewModel: GerminasiSeedViewModel by viewModels()
    private val appRoutes = AppRoutes.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGerminasi2SeedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = MenuListAdapter()
        adapter.listener = this
        binding.rvMenuDetail.layoutManager = LinearLayoutManager(this)
        binding.rvMenuDetail.adapter = adapter

        germinasiViewModel.listMenuDetail2.observe(this, {
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