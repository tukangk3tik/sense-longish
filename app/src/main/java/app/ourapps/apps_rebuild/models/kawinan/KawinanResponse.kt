package app.ourapps.apps_rebuild.models.kawinan

data class KawinanResponse (
    override val id: Int,
    override val noKawinan: String,
    override val waktuScan: String?
): IKawinanModel