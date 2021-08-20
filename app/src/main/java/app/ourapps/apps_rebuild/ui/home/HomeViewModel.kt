package app.ourapps.apps_rebuild.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.data.mainMenu
import app.ourapps.apps_rebuild.models.menu.Menu

class HomeViewModel : ViewModel() {

    private val _mainMenu = MutableLiveData<List<Menu>>().apply {
        value = mainMenu
    }

    val listMainMenu: LiveData<List<Menu>> = _mainMenu
}