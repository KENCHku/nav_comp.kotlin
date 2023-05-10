package kg.geeks.nav_compkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import kg.geeks.nav_compkotlin.databinding.FragmentSecondBinding
import java.security.Key

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onFabClick()
    }

    private fun onFabClick() {
        binding.fabSf.setOnClickListener {
            passData()
        }
    }

    private fun passData() {
        if (binding.etAgeSf.text.toString().isNotEmpty() && binding.etGenderSf.text.toString().isNotEmpty()) {
            val bundle = arguments
            if (bundle != null) {

                bundle.putString(Keys.KEY_AGE, binding.etAgeSf.text.toString())
                bundle.putString(Keys.KEY_GENDER, binding.etGenderSf.text.toString())

                findNavController().navigate(R.id.action_secondFragment_to_thirdFragment, bundle)
            }
        } else {
            Toast.makeText(requireContext(), "Fill the fields!", Toast.LENGTH_SHORT).show()
        }
    }
}