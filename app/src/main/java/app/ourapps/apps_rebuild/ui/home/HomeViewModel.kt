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

    private val _userIdentity : MutableLiveData<List<String>>? = null

    fun setIdentity(nama: String, jabatan: String){
        val user = listOf(nama, jabatan)
        _userIdentity?.postValue(user)
    }

    fun getIdentity(): LiveData<List<String>>? = _userIdentity

    fun isAvailableIdentity(): Boolean {
        return _userIdentity != null
    }
}