package app.ourapps.apps_rebuild

import app.ourapps.apps_rebuild.ui.breed.BreedingActivity
import app.ourapps.apps_rebuild.ui.seedp.SeedPActivity

class AppRoutes {

    private var classRoute : Class<*>? = null

    companion object {
        @Volatile
        private var INSTANCE : AppRoutes? = null

        fun getInstance(): AppRoutes = INSTANCE ?: synchronized(this){
            val instance = AppRoutes()
            INSTANCE = instance
            instance
        }
    }

    fun setDestination(destination: String) {
        when (destination) {
            "sp" -> classRoute = SeedPActivity::class.java
            "breeding" -> classRoute = BreedingActivity::class.java
            else -> {
                classRoute = null
                println("No route available!")
            }
        }
    }

    fun getActivityRoute(): Class<*>? {
        return classRoute
    }
}