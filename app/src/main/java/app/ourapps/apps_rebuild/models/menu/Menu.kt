package app.ourapps.apps_rebuild.models.menu

import android.app.Activity
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Menu(
    var id : Int,
    var nameStrRes : Int,
    var type : MenuType,
    var imageIcon : Int,
    var route : String,
    var parent : Int? = null
) : Parcelable
