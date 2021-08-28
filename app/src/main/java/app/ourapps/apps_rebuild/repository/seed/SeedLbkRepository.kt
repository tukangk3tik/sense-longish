package app.ourapps.apps_rebuild.repository.seed

class SeedLbkRepository {

    companion object {
        @Volatile
        private var INSTANCE: SeedLbkRepository? = null

        fun getInstance(): SeedLbkRepository = INSTANCE ?: synchronized(this) {
            val instance = SeedLbkRepository()
            INSTANCE = instance
            instance
        }
    }

}