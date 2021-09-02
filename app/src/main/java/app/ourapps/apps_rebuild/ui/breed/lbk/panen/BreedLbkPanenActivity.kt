package app.ourapps.apps_rebuild.ui.breed.lbk.panen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkPanenBinding

class BreedLbkPanenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkPanenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkPanenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkPanenFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkPanenFragment::class.java.simpleName)

        if (fragment !is BreedLbkPanenFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPanen.id, mListFragment, BreedLbkPanenFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}