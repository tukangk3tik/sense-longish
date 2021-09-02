package app.ourapps.apps_rebuild.ui.breed.germinasi_1.r_panas

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin1RPanasTambahBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1RuangPanasTambahBinding

class BreedGermin1RPanasTambahFragment : Fragment() {

    private var _binding: FragmentBreedGermin1RPanasTambahBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin1RPanasTambahBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        // Inflate the layout for this fragment
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.edtNoProduksi.inputType = InputType.TYPE_NULL
        binding.edtNoProduksi.setTextIsSelectable(false)
    }

}