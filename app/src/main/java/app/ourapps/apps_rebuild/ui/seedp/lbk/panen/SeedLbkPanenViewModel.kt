package app.ourapps.apps_rebuild.ui.seedp.lbk.panen

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import app.ourapps.apps_rebuild.models.kawinan.Kawinan
import app.ourapps.apps_rebuild.repository.seed.SeedLbkRepository

class SeedLbkPanenViewModel : ViewModel() {

    private var repository: SeedLbkRepository = SeedLbkRepository.getInstance()
    private val _panenData: LiveData<ArrayList<Kawinan>>? = null

    fun getAllPanenData(): LiveData<ArrayList<Kawinan>>? = _panenData


}