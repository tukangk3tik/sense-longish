package app.ourapps.apps_rebuild.ui.seedp.lbk.terima_kiriman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkTerimaKirimBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.pengiriman.SeedLbkPengirimanFragment
import app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi.SeedLbkSortasiFragment

class SeedLbkTerimaKirimActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkTerimaKirimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkTerimaKirimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkTerimaKirimFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkTerimaKirimFragment::class.java.simpleName)

        if (fragment !is SeedLbkTerimaKirimFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerTerimaKirim.id, mListFragment, SeedLbkTerimaKirimFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}