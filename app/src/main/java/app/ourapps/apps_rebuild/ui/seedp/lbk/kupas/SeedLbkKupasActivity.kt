package app.ourapps.apps_rebuild.ui.seedp.lbk.kupas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkKupasBinding

class SeedLbkKupasActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkKupasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkKupasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkKupasFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkKupasFragment::class.java.simpleName)

        if (fragment !is SeedLbkKupasFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKupas.id, mListFragment, SeedLbkKupasFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}