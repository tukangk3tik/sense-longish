package app.ourapps.apps_rebuild.ui.breed.lbk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import app.ourapps.apps_rebuild.databinding.ActivityLbkbreedBinding
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.utils.AppRoutes
import app.ourapps.apps_rebuild.utils.MenuClickListener
import app.ourapps.apps_rebuild.utils.menu.MenuListAdapter

class LBKBreedActivity : AppCompatActivity(), MenuClickListener {

    private lateinit var binding: ActivityLbkbreedBinding
    private val lbkBreedViewModel: LBKBreedViewModel by viewModels()
    private val appRoutes = AppRoutes.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLbkbreedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MenuListAdapter()
        adapter.listener = this
        binding.rvMenuDetail.layoutManager = LinearLayoutManager(this)
        binding.rvMenuDetail.adapter = adapter

        lbkBreedViewModel.listSubMenuDetail.observe(this, {
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