package app.ourapps.apps_rebuild.data

import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.models.menu.MenuType

//menu for home
val mainMenu = listOf(
    Menu(99,  R.string.seed_production, MenuType.MAIN, R.drawable.ic_menu_sp, "sp"),
    Menu(98, R.string.breeding, MenuType.MAIN, R.drawable.ic_menu_breeding, "breeding")
)

val subMenuSP = listOf(
    Menu(50,  R.string.lbk, MenuType.SUBMAIN, R.drawable.icon_lbk, "sp_lbk"),
    Menu(51, R.string.germinasi_1, MenuType.SUBMAIN, R.drawable.icon_germinasi_1, "sp_germinasi_1"),
    Menu(52, R.string.germinasi_2, MenuType.SUBMAIN, R.drawable.icon_germinasi_2, "sp_germinasi_2")
)

val subMenuBreeding = listOf(
    Menu(53,  R.string.lbk, MenuType.SUBMAIN, R.drawable.icon_lbk, "breed_lbk"),
    Menu(54, R.string.germinasi_1, MenuType.SUBMAIN, R.drawable.icon_germinasi_1, "breed_germinasi_1"),
    Menu(55, R.string.germinasi_2, MenuType.SUBMAIN, R.drawable.icon_germinasi_2, "breed_germinasi_2")
)

val subMenuLBKSP = listOf(
    Menu(5,  R.string.panen, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_panen"),
    Menu(6, R.string.timbang, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_timbang"),
    Menu(7,  R.string.ethreel, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_ethreel"),
    Menu(8, R.string.rontok, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_rontok"),
    Menu(9,  R.string.rendam, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_rendam"),
    Menu(10, R.string.kupas, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_kupas"),
    Menu(11,  R.string.sortasi, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_sortasi"),
    Menu(12, R.string.penggonian, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_goni"),
    Menu(13,  R.string.gudang, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_gudang"),
    Menu(14, R.string.pengiriman, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_kirim"),
    Menu(15,  R.string.penerimaan_kiriman, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_terima_kiriman"),
    Menu(16, R.string.penyimpanan_kiriman, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_lbk_simpan_kiriman"),
)

val subMenuLBKBreeding = listOf(
    Menu(17,  R.string.panen, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_panen"),
    Menu(18, R.string.timbang, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_timbang"),
    Menu(19,  R.string.ethreel, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_ethreel"),
    Menu(20, R.string.rontok, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_rontok"),
    Menu(21,  R.string.rendam, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_rendam"),
    Menu(22, R.string.kupas, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_timbang"),
    Menu(23,  R.string.sortasi, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_panen"),
    Menu(24, R.string.penggonian, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_timbang"),
    Menu(25,  R.string.gudang, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_panen"),
    Menu(26, R.string.pengiriman, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_timbang"),
    Menu(27,  R.string.penerimaan_kiriman, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_panen"),
    Menu(28, R.string.penyimpanan_kiriman, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_lbk_timbang"),
)

val subMenuGerminasi1SP = listOf(
    Menu(5,  R.string.r_apung, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_1_apung"),
    Menu(6, R.string.r_apung_afkir, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_1_apung_afkir"),
    Menu(7,  R.string.rendam, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_1_rendam"),
    Menu(8, R.string.fungisida, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_1_fungisida"),
    Menu(9,  R.string.kering_angin, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_1_kering_angin"),
    Menu(10, R.string.suhu_ruang_panas, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_1_suhu_ruang_panas"),
    Menu(11,  R.string.ruang_panas, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_1_ruang_panas")
)

val subMenuGerminasi2SP = listOf(
    Menu(5,  R.string.prehating, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_preheat"),
    Menu(7,  R.string.rendam, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_rendam"),
    Menu(8, R.string.fungisida, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_fungisida"),
    Menu(9,  R.string.kering_angin, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kering_angin"),
    Menu(10, R.string.r_gelap, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_ruang_gelap"),
    Menu(11, R.string.aerasi_r_gelap, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_aerasi_ruang_gelap"),
    Menu(10, R.string.kutip_1, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kutip_1"),
    Menu(10, R.string.kutip_2, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kutip_2"),
    Menu(10, R.string.kutip_3, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kutip_3"),
    Menu(10, R.string.kutip_4, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kutip_4"),
    Menu(10, R.string.kutip_5, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kutip_5"),
    Menu(10, R.string.kutip_kch_1, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kutip_kch_1"),
    Menu(10, R.string.kutip_kch_2, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "sp_ger_2_kutip_kch_2"),
)

val subMenuGerminasi1Breed = listOf(
    Menu(7,  R.string.rendam, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_1_rendam"),
    Menu(8, R.string.fungisida, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_1_fungisida"),
    Menu(9,  R.string.kering_angin, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_1_kering_angin"),
    Menu(11,  R.string.ruang_panas, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_1_ruang_panas"),
    Menu(11,  R.string.aerasi, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_1_ruang_panas")
)

val subMenuGerminasi2Breed = listOf(
    Menu(5,  R.string.prehating, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_preheat"),
    Menu(7,  R.string.rendam, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_rendam"),
    Menu(8, R.string.fungisida, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_fungisida"),
    Menu(9,  R.string.kering_angin, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_kering_angin"),
    Menu(10, R.string.r_gelap, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_ruang_gelap"),
    Menu(10, R.string.kutip_1, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_kutip_1"),
    Menu(10, R.string.kutip_2, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_kutip_2"),
    Menu(10, R.string.kutip_3, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_kutip_3"),
    Menu(10, R.string.kutip_4, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_kutip_4"),
    Menu(10, R.string.kutip_5, MenuType.SUBMAIN, R.drawable.ic_detail_menu_192, "breed_ger_2_kutip_5")
)