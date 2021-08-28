package app.ourapps.apps_rebuild.utils.kawinan

import android.view.View
import app.ourapps.apps_rebuild.models.kawinan.Kawinan

interface KawinanClickListener {
    fun onItemClicked(view: View, kawinan: Kawinan)

    fun onLongItemTap(view: View, kawinan: Kawinan)
}