package app.ourapps.apps_rebuild.ui.breed

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import app.ourapps.apps_rebuild.databinding.ActivityBreedingBinding
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.utils.AppRoutes
import app.ourapps.apps_rebuild.utils.MenuClickListener
import app.ourapps.apps_rebuild.utils.menu.MenuListAdapter

class BreedingActivity : AppCompatActivity(), MenuClickListener {


    private lateinit var binding: ActivityBreedingBinding
    private val breedViewModel: BreedingViewModel by viewModels()
    private val appRoutes = AppRoutes.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MenuListAdapter()
        adapter.listener = this
        binding.rvMenuDetail.layoutManager = LinearLayoutManager(this)
        binding.rvMenuDetail.adapter = adapter

        breedViewModel.listSubMenu.observe(this, {
            if (it.isNotEmpty()){
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