package app.ourapps.apps_rebuild.ui.seedp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.data.subMenuGerminasi1SP
import app.ourapps.apps_rebuild.data.subMenuGerminasi2SP
import app.ourapps.apps_rebuild.models.menu.Menu

class GerminasiSeedViewModel: ViewModel() {

    private val _subMenuDetail1 = MutableLiveData<List<Menu>>().apply {
        value = subMenuGerminasi1SP
    }

    val listMenuDetail1: LiveData<List<Menu>> = _subMenuDetail1

    private val _subMenuDetail2 = MutableLiveData<List<Menu>>().apply {
        value = subMenuGerminasi2SP
    }

    val listMenuDetail2: LiveData<List<Menu>> = _subMenuDetail2
}