package app.ourapps.apps_rebuild.ui.breed.germinasi_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import app.ourapps.apps_rebuild.databinding.ActivityGerminasi2BreedBinding
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.ui.breed.GerminasiBreedViewModel
import app.ourapps.apps_rebuild.utils.AppRoutes
import app.ourapps.apps_rebuild.utils.menu.MenuClickListener
import app.ourapps.apps_rebuild.utils.menu.MenuListAdapter

class Germinasi2BreedActivity : AppCompatActivity(), MenuClickListener {

    private lateinit var binding: ActivityGerminasi2BreedBinding
    private val germinasiViewModel: GerminasiBreedViewModel by viewModels()
    private val appRoutes = AppRoutes.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGerminasi2BreedBinding.inflate(layoutInflater)
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