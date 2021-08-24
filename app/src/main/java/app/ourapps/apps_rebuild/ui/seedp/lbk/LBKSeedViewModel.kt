package app.ourapps.apps_rebuild.ui.seedp.lbk

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.data.subMenuLBKSP
import app.ourapps.apps_rebuild.data.subMenuSP
import app.ourapps.apps_rebuild.models.menu.Menu

class LBKSeedViewModel: ViewModel() {

    private val _subMenuDetail = MutableLiveData<List<Menu>>().apply {
        value = subMenuLBKSP
    }

    val listSubMenuDetail: LiveData<List<Menu>> = _subMenuDetail
}