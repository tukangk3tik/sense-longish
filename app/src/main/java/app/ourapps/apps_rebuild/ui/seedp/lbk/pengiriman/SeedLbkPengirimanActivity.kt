package app.ourapps.apps_rebuild.ui.seedp.lbk.pengiriman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkPengirimanBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi.SeedLbkSortasiFragment

class SeedLbkPengirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkPengirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkPengirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkPengirimanFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkPengirimanFragment::class.java.simpleName)

        if (fragment !is SeedLbkSortasiFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPengiriman.id, mListFragment, SeedLbkPengirimanFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}