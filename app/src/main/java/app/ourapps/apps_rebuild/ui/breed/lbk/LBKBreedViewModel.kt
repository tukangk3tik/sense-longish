package app.ourapps.apps_rebuild.ui.breed.lbk

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.data.subMenuLBKBreeding
import app.ourapps.apps_rebuild.data.subMenuLBKSP
import app.ourapps.apps_rebuild.data.subMenuSP
import app.ourapps.apps_rebuild.models.menu.Menu

class LBKBreedViewModel: ViewModel() {

    private val _subMenuDetail = MutableLiveData<List<Menu>>().apply {
        value = subMenuLBKBreeding
    }

    val listSubMenuDetail: LiveData<List<Menu>> = _subMenuDetail
}