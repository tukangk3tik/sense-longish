package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.fungisida

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2FungisidaBinding

class SeedGermin2FungisidaActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySeedGermin2FungisidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2FungisidaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2FungisidaFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2FungisidaFragment::class.java.simpleName)

        if (fragment !is SeedGermin2FungisidaFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerFungisida.id, mListFragment, SeedGermin2FungisidaFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}