package app.ourapps.apps_rebuild.ui.seedp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.data.subMenuSP
import app.ourapps.apps_rebuild.models.menu.Menu

class SeedPViewModel: ViewModel() {

    private val _subMenu = MutableLiveData<List<Menu>>().apply {
        value = subMenuSP
    }

    val listSubMenu: LiveData<List<Menu>> = _subMenu
}