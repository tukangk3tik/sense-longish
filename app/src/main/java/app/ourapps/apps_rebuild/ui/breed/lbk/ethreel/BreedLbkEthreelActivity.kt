package app.ourapps.apps_rebuild.ui.breed.lbk.ethreel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkEthreelBinding

class BreedLbkEthreelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkEthreelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkEthreelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkEthreelFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkEthreelFragment::class.java.simpleName)

        if (fragment !is BreedLbkEthreelFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerEthreel.id, mListFragment, BreedLbkEthreelFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}