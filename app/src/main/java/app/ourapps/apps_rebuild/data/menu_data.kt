package app.ourapps.apps_rebuild.data

import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.models.menu.MenuType
import app.ourapps.apps_rebuild.ui.breed.BreedingActivity
import app.ourapps.apps_rebuild.ui.seedp.SeedPActivity

//menu for home
val mainMenu = listOf<Menu>(
    Menu(1,  R.string.seed_production, MenuType.MAIN, R.drawable.ic_menu_sp, "sp"),
    Menu(2, R.string.breeding, MenuType.MAIN, R.drawable.ic_menu_breeding, "breeding")
)

val subMenu = listOf<Menu>(

)