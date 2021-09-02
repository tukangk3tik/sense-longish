package app.ourapps.apps_rebuild.ui.breed.lbk.rontok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkRontokBinding

class BreedLbkRontokActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkRontokBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkRontokBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkRontokFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkRontokFragment::class.java.simpleName)

        if (fragment !is BreedLbkRontokFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRontok.id, mListFragment, BreedLbkRontokFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}