package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.rendam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1ApungBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1RendamBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung.SeedGermin1ApungTambahFragment

class SeedGermin1RendamFragment : Fragment() {

    private var _binding: FragmentSeedGermin1RendamBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin1RendamBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedGermin1RendamTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_rendam, mFragment, SeedGermin1RendamTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }

}