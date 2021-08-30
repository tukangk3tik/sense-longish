package app.ourapps.apps_rebuild.utils

import app.ourapps.apps_rebuild.ui.breed.BreedingActivity
import app.ourapps.apps_rebuild.ui.breed.germinasi_1.Germinasi1BreedActivity
import app.ourapps.apps_rebuild.ui.breed.germinasi_2.Germinasi2BreedActivity
import app.ourapps.apps_rebuild.ui.breed.lbk.LBKBreedActivity
import app.ourapps.apps_rebuild.ui.seedp.SeedPActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.Germinasi1SeedActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.fungisida.SeedGermin1FungisidaActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.kering_angin.SeedGermin1KeringAnginActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung.SeedGermin1ApungActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung_afkir.SeedGermin1AfkirApungActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_panas.SeedGermin1RuangPanasActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.rendam.SeedGermin1RendamActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.suhu_r_panas.SeedGermin1SuhuRPanasActivity
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.Germinasi2SeedActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.LBKSeedActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.ethreel.SeedLbkEthreelActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.gudang.SeedLbkGudangActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.kupas.SeedLbkKupasActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.panen.SeedLbkPanenActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.penggonian.SeedLbkPenggonianActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.pengiriman.SeedLbkPengirimanActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.rendam.SeedLbkRendamActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.rontok.SeedLbkRontokActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.simpan_kiriman.SeedLbkSimpanKirimanActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi.SeedLbkSortasiActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.terima_kiriman.SeedLbkTerimaKirimActivity
import app.ourapps.apps_rebuild.ui.seedp.lbk.timbang.SeedLbkTimbangActivity

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

            //seed production lbk
            "sp_lbk" -> classRoute = LBKSeedActivity::class.java
            "sp_lbk_panen" -> classRoute = SeedLbkPanenActivity::class.java
            "sp_lbk_timbang" -> classRoute = SeedLbkTimbangActivity::class.java
            "sp_lbk_ethreel" -> classRoute = SeedLbkEthreelActivity::class.java
            "sp_lbk_rontok" -> classRoute = SeedLbkRontokActivity::class.java
            "sp_lbk_rendam" -> classRoute = SeedLbkRendamActivity::class.java
            "sp_lbk_kupas" -> classRoute = SeedLbkKupasActivity::class.java
            "sp_lbk_sortasi" -> classRoute = SeedLbkSortasiActivity::class.java
            "sp_lbk_goni" -> classRoute = SeedLbkPenggonianActivity::class.java
            "sp_lbk_gudang" -> classRoute = SeedLbkGudangActivity::class.java
            "sp_lbk_kirim" -> classRoute = SeedLbkPengirimanActivity::class.java
            "sp_lbk_terima_kiriman" -> classRoute = SeedLbkTerimaKirimActivity::class.java
            "sp_lbk_simpan_kiriman" -> classRoute = SeedLbkSimpanKirimanActivity::class.java

            //seed production germinasi 1
            "sp_germinasi_1" -> classRoute = Germinasi1SeedActivity::class.java
            "sp_ger_1_apung" -> classRoute = SeedGermin1ApungActivity::class.java
            "sp_ger_1_apung_afkir" -> classRoute = SeedGermin1AfkirApungActivity::class.java
            "sp_ger_1_rendam" -> classRoute = SeedGermin1RendamActivity::class.java
            "sp_ger_1_fungisida" -> classRoute = SeedGermin1FungisidaActivity::class.java
            "sp_ger_1_kering_angin" -> classRoute = SeedGermin1KeringAnginActivity::class.java
            "sp_ger_1_suhu_ruang_panas" -> classRoute = SeedGermin1SuhuRPanasActivity::class.java
            "sp_ger_1_ruang_panas" -> classRoute = SeedGermin1RuangPanasActivity::class.java


            "sp_germinasi_2" -> classRoute = Germinasi2SeedActivity::class.java

            "breed_lbk" -> classRoute = LBKBreedActivity::class.java
            "breed_germinasi_1" -> classRoute = Germinasi1BreedActivity::class.java
            "breed_germinasi_2" -> classRoute = Germinasi2BreedActivity::class.java
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