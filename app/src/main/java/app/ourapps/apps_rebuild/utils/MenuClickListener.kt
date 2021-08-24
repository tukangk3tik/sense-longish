package app.ourapps.apps_rebuild.utils

import android.view.View
import app.ourapps.apps_rebuild.models.menu.Menu

interface MenuClickListener {
    fun onItemClicked(view: View, menu: Menu)
}