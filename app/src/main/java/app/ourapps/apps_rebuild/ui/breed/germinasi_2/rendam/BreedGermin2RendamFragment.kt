package app.ourapps.apps_rebuild.ui.breed.germinasi_2.rendam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin2RendamBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin2RendamBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.rendam.SeedGermin2RendamTambahFragment

class BreedGermin2RendamFragment : Fragment() {

    private var _binding: FragmentBreedGermin2RendamBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin2RendamBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = BreedGermin2RendamTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_rendam, mFragment, BreedGermin2RendamTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }
}