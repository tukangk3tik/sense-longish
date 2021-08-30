package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.kering_angin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1KeringAnginBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.fungisida.SeedGermin1FungisidaFragment
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung.SeedGermin1ApungFragment

class SeedGermin1KeringAnginActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1KeringAnginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1KeringAnginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin1KeringAnginFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin1KeringAnginFragment::class.java.simpleName)

        if (fragment !is SeedGermin1KeringAnginFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKeringAngin.id, mListFragment, SeedGermin1KeringAnginFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}