package app.ourapps.apps_rebuild.ui.breed.lbk.gudang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkGudangBinding

class BreedLbkGudangActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkGudangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkGudangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkGudangFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkGudangFragment::class.java.simpleName)

        if (fragment !is BreedLbkGudangFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerGudang.id, mListFragment, BreedLbkGudangFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}