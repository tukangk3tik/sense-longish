package app.ourapps.apps_rebuild.ui.seedp.lbk.simpan_kiriman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkSimpanKirimanBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi.SeedLbkSortasiFragment

class SeedLbkSimpanKirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkSimpanKirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkSimpanKirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkSimpanKirimanFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkSimpanKirimanFragment::class.java.simpleName)

        if (fragment !is SeedLbkSortasiFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerSimpanKirim.id, mListFragment, SeedLbkSimpanKirimanFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}