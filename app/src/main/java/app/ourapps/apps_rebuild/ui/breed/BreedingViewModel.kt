package app.ourapps.apps_rebuild.ui.breed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.data.subMenuBreeding
import app.ourapps.apps_rebuild.data.subMenuSP
import app.ourapps.apps_rebuild.models.menu.Menu

class BreedingViewModel: ViewModel() {

    private val _subMenu = MutableLiveData<List<Menu>>().apply {
        value = subMenuBreeding
    }

    val listSubMenu: LiveData<List<Menu>> = _subMenu
}