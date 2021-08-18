package app.socfindo.sspl_apps_v2.models.menu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Menu(
    var id : Int,
    var name : String,
    var type : MenuType,
    var imageIcon : Int? = null,
    var parent : Int? = null
) : Parcelable
