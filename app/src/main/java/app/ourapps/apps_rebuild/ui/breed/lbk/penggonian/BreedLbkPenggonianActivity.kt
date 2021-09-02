package app.ourapps.apps_rebuild.ui.breed.lbk.penggonian

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkPenggonianBinding

class BreedLbkPenggonianActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkPenggonianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkPenggonianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedLbkPenggonianFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedLbkPenggonianFragment::class.java.simpleName)

        if (fragment !is BreedLbkPenggonianFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPenggonian.id, mListFragment, BreedLbkPenggonianFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}