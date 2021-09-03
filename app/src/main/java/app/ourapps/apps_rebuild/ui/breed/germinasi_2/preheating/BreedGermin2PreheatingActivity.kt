package app.ourapps.apps_rebuild.ui.breed.germinasi_2.preheating

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2PreheatingBinding

class BreedGermin2PreheatingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2PreheatingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2PreheatingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2PreheatingFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2PreheatingFragment::class.java.simpleName)

        if (fragment !is BreedGermin2PreheatingFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPreheating.id, mListFragment, BreedGermin2PreheatingFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}