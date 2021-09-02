package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.fungisida

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1FungisidaBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung.SeedGermin1ApungFragment

class SeedGermin1FungisidaActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySeedGermin1FungisidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1FungisidaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin1FungisidaFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin1FungisidaFragment::class.java.simpleName)

        if (fragment !is SeedGermin1FungisidaFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerFungisida.id, mListFragment, SeedGermin1FungisidaFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}