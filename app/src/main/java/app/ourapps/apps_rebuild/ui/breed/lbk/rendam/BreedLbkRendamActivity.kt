package app.ourapps.apps_rebuild.ui.breed.lbk.rendam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkRendamBinding

class BreedLbkRendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkRendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkRendamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkRendamFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkRendamFragment::class.java.simpleName)

        if (fragment !is BreedLbkRendamFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRendam.id, mListFragment, BreedLbkRendamFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}