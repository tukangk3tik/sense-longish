package app.ourapps.apps_rebuild.ui.breed.lbk.simpan_kiriman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkSimpanKirimanBinding

class BreedLbkSimpanKirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkSimpanKirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkSimpanKirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkSimpanKirimanFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkSimpanKirimanFragment::class.java.simpleName)

        if (fragment !is BreedLbkSimpanKirimanFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerSimpanKirim.id, mListFragment, BreedLbkSimpanKirimanFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}