package app.ourapps.apps_rebuild.ui.seedp.lbk.gudang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkGudangBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi.SeedLbkSortasiFragment

class SeedLbkGudangActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkGudangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkGudangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkGudangFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkGudangFragment::class.java.simpleName)

        if (fragment !is SeedLbkSortasiFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerGudang.id, mListFragment, SeedLbkGudangFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}