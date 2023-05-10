package kg.geeks.nav_compkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kg.geeks.nav_compkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val bundle = Bundle()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onFabClick()
    }

    private fun onFabClick() {
        binding.fabFf.setOnClickListener {
            dataPass()
        }
    }

    private fun dataPass() {
            if (!binding.etNameFf.text.isNullOrEmpty() && !binding.etSurnameFf.text.isNullOrEmpty()) {
                bundle.putString(Keys.KEY_NAME, binding.etNameFf.text.toString())
                bundle.putString(Keys.KEY_SURNAME, binding.etSurnameFf.text.toString())
                //NAVIGATE
                findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)//NEW WAY OF NAVIGATION
            } else {
                Toast.makeText(requireContext(), "Fill the fields!", Toast.LENGTH_SHORT).show()
            }
        }
}