package app.ourapps.apps_rebuild.ui.breed.lbk.sortasi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkSortasiBinding

class BreedLbkSortasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkSortasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkSortasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkSortasiFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkSortasiFragment::class.java.simpleName)

        if (fragment !is BreedLbkSortasiFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerSortasi.id, mListFragment, BreedLbkSortasiFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}