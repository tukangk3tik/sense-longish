package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.kering_angin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1FungisidaBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1KeringAnginBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.fungisida.SeedGermin1FungisidaTambahFragment

class SeedGermin1KeringAnginFragment : Fragment() {

    private var _binding: FragmentSeedGermin1KeringAnginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin1KeringAnginBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedGermin1KeringAnginTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_kering_angin, mFragment, SeedGermin1KeringAnginTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }



}