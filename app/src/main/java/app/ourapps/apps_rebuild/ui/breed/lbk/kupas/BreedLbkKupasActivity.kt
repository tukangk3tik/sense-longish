package app.ourapps.apps_rebuild.ui.breed.lbk.kupas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkKupasBinding

class BreedLbkKupasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkKupasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkKupasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkKupasFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkKupasFragment::class.java.simpleName)

        if (fragment !is BreedLbkKupasFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKupas.id, mListFragment, BreedLbkKupasFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}