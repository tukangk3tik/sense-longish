package app.ourapps.apps_rebuild.ui.breed.germinasi_1.kering_angin

import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin1KeringAnginTambahBinding


class BreedGermin1KeringAnginTambahFragment : Fragment() {

    private var _binding: FragmentBreedGermin1KeringAnginTambahBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin1KeringAnginTambahBinding.inflate(layoutInflater, container, false)
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