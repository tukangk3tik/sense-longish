package app.ourapps.apps_rebuild.models.kawinan

//for domain layer
data class Kawinan(
    override val id: Int,
    override val noKawinan: String,
    override val waktuScan: String?
): IKawinanModel
