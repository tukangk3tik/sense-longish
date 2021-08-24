package app.ourapps.apps_rebuild.utils

import app.ourapps.apps_rebuild.ui.breed.BreedingActivity
import app.ourapps.apps_rebuild.ui.breed.germinasi_1.Germinasi1BreedActivity
import app.ourapps.apps_rebuild.ui.breed.germinasi_2.Germinasi2BreedActivity
import app.ourapps.apps_rebuild.ui.breed.lbk.LBKBreedActivity
import app.ourapps.apps_rebuild.ui.seedp.SeedPActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.Germinasi1SeedActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.Germinasi2SeedActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.LBKSeedActivity

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
            "lbk_sp" -> classRoute = LBKSeedActivity::class.java
            "lbk_breed" -> classRoute = LBKBreedActivity::class.java
            "germinasi_1_sp" -> classRoute = Germinasi1SeedActivity::class.java
            "germinasi_2_sp" -> classRoute = Germinasi2SeedActivity::class.java
            "germinasi_1_breed" -> classRoute = Germinasi1BreedActivity::class.java
            "germinasi_2_breed" -> classRoute = Germinasi2BreedActivity::class.java
            else -> {
                classRoute = null
                println("No route available!")
            }
        }
    }

    fun getRoute(): Class<*>? {
        return classRoute
    }
}