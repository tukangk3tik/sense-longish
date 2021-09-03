package app.ourapps.apps_rebuild.ui.breed.germinasi_2.r_gelap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin2RGelapBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin2RGelapBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.r_gelap.SeedGermin2RGelapTambahFragment

class BreedGermin2RGelapFragment : Fragment() {

    private var _binding: FragmentBreedGermin2RGelapBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin2RGelapBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = BreedGermin2RGelapTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_ruang_gelap, mFragment, BreedGermin2RGelapTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }
}