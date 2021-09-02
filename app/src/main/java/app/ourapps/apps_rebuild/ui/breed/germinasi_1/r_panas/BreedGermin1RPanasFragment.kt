package app.ourapps.apps_rebuild.ui.breed.germinasi_1.r_panas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin1RPanasBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1RuangPanasBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_panas.SeedGermin1RuangPanasTambahFragment

class BreedGermin1RPanasFragment : Fragment() {

    private var _binding: FragmentBreedGermin1RPanasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin1RPanasBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedGermin1RuangPanasTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_ruang_panas, mFragment, FragmentBreedGermin1RPanasBinding::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }
}