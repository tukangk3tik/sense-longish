package app.ourapps.apps_rebuild.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import app.ourapps.apps_rebuild.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var adapter: MenuGridAdapter

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel = HomeViewModel()

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        adapter = MenuGridAdapter()
        binding.rvMainMenu.layoutManager = GridLayoutManager(root.context, 2)
        binding.rvMainMenu.adapter = adapter

        homeViewModel.listMainMenu.observe(viewLifecycleOwner, Observer {
            if (it.isNotEmpty()){
                adapter.setData(it)
            }
        })

        // Inflate the layout for this fragment
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}