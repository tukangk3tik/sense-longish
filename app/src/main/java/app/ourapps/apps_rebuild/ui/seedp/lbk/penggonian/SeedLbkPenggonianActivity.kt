package app.ourapps.apps_rebuild.ui.seedp.lbk.penggonian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkPenggonianBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi.SeedLbkSortasiFragment

class SeedLbkPenggonianActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkPenggonianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkPenggonianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkPenggonianFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkPenggonianFragment::class.java.simpleName)

        if (fragment !is SeedLbkSortasiFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPenggonian.id, mListFragment, SeedLbkPenggonianFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}