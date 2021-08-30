package app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkSortasiBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.kupas.SeedLbkKupasFragment

class SeedLbkSortasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkSortasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkSortasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkSortasiFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkSortasiFragment::class.java.simpleName)

        if (fragment !is SeedLbkSortasiFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerSortasi.id, mListFragment, SeedLbkSortasiFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}