package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung_afkir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1AfkirApungBinding

class SeedGermin1AfkirApungActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1AfkirApungBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1AfkirApungBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin1AfkirApungFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin1AfkirApungFragment::class.java.simpleName)

        if (fragment !is SeedGermin1AfkirApungFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerAfkirApung.id, mListFragment, SeedGermin1AfkirApungFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

}