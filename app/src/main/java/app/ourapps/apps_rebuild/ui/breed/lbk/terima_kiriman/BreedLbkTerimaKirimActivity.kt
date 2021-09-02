package app.ourapps.apps_rebuild.ui.breed.lbk.terima_kiriman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkTerimaKirimBinding

class BreedLbkTerimaKirimActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkTerimaKirimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkTerimaKirimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkTerimaKirimFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkTerimaKirimFragment::class.java.simpleName)

        if (fragment !is BreedLbkTerimaKirimFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerTerimaKirim.id, mListFragment, BreedLbkTerimaKirimFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}