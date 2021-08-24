package app.ourapps.apps_rebuild.ui.breed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.data.subMenuGerminasi1Breed
import app.ourapps.apps_rebuild.data.subMenuGerminasi2Breed
import app.ourapps.apps_rebuild.models.menu.Menu

class GerminasiBreedViewModel: ViewModel() {

    private val _subMenuDetail1 = MutableLiveData<List<Menu>>().apply {
        value = subMenuGerminasi1Breed
    }

    val listMenuDetail1: LiveData<List<Menu>> = _subMenuDetail1

    private val _subMenuDetail2 = MutableLiveData<List<Menu>>().apply {
        value = subMenuGerminasi2Breed
    }

    val listMenuDetail2: LiveData<List<Menu>> = _subMenuDetail2
}