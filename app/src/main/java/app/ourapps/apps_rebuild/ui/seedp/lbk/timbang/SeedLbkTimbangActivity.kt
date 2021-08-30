package app.ourapps.apps_rebuild.ui.seedp.lbk.timbang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkTimbangBinding

class SeedLbkTimbangActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkTimbangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkTimbangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkTimbangFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkTimbangFragment::class.java.simpleName)

        if (fragment !is SeedLbkTimbangFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerTimbang.id, mListFragment, SeedLbkTimbangFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}