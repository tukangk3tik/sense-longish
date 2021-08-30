package app.ourapps.apps_rebuild.ui.seedp.lbk.ethreel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkEthreelBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkTimbangBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.timbang.SeedLbkTimbangTambahFragment

class SeedLbkEthreelFragment : Fragment() {

    private var _binding: FragmentSeedLbkEthreelBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedLbkEthreelBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedLbkEthreelTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_ethreel, mFragment, SeedLbkEthreelTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }
}