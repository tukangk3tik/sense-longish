package app.ourapps.apps_rebuild.ui.breed.lbk.pengiriman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkPengirimanBinding

class BreedLbkPengirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkPengirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkPengirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkPengirimanFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkPengirimanFragment::class.java.simpleName)

        if (fragment !is BreedLbkPengirimanFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPengiriman.id, mListFragment, BreedLbkPengirimanFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}