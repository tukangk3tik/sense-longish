package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kering_angin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2KeringAnginBinding

class SeedGermin2KeringAnginActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2KeringAnginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2KeringAnginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2KeringAnginFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2KeringAnginFragment::class.java.simpleName)

        if (fragment !is SeedGermin2KeringAnginFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKeringAngin.id, mListFragment, SeedGermin2KeringAnginFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}