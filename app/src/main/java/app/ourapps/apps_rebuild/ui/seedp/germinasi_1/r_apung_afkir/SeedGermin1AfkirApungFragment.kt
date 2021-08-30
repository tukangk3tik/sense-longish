package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung_afkir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1AfkirApungBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung.SeedGermin1ApungTambahFragment

class SeedGermin1AfkirApungFragment : Fragment() {

    private var _binding: FragmentSeedGermin1AfkirApungBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin1AfkirApungBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedGermin1AfkirApungTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_afkir_apung, mFragment, SeedGermin1AfkirApungTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }

}