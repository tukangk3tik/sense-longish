package app.ourapps.apps_rebuild.ui.seedp.lbk.terima_kiriman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkPengirimanBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkTerimaKirimBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.pengiriman.SeedLbkPengirimanTambahFragment

class SeedLbkTerimaKirimFragment : Fragment() {

    private var _binding: FragmentSeedLbkTerimaKirimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedLbkTerimaKirimBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedLbkTerimaKirimTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(
                    R.id.fragment_container_terima_kirim,
                    mFragment,
                    SeedLbkTerimaKirimTambahFragment::class.java.simpleName
                )
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }


}