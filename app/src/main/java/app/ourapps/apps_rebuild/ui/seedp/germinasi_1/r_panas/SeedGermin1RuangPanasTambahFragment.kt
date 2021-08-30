package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_panas

import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1RuangPanasTambahBinding

class SeedGermin1RuangPanasTambahFragment : Fragment() {

    private var _binding: FragmentSeedGermin1RuangPanasTambahBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin1RuangPanasTambahBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        // Inflate the layout for this fragment
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.edtNoKantong.inputType = InputType.TYPE_NULL
        binding.edtNoKantong.setTextIsSelectable(false)
    }

}