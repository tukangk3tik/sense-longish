package app.ourapps.apps_rebuild.ui.breed.lbk.timbang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkTimbangBinding

class BreedLbkTimbangActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkTimbangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkTimbangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkTimbangFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkTimbangFragment::class.java.simpleName)

        if (fragment !is BreedLbkTimbangFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerTimbang.id, mListFragment, BreedLbkTimbangFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}