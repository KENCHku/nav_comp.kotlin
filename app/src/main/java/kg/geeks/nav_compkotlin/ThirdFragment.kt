package kg.geeks.nav_compkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kg.geeks.nav_compkotlin.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onFabClick()
    }

    private fun onFabClick() {
        binding.fabTf.setOnClickListener {
            passData()
        }
    }

    private fun passData() {
        if (binding.etSchoolTf.text.toString().isNotEmpty() && binding.etSchoolTf.text.toString().isNotEmpty()) {

            val bundle = arguments
            if (bundle != null) {

                bundle.putString(Keys.KEY_SCHOOL, binding.etSchoolTf.text.toString())
                bundle.putString(Keys.KEY_WORK, binding.etWorkTf.text.toString())

                findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment, bundle)
            }
        }else {
            Toast.makeText(requireContext(), "Fill the fields!", Toast.LENGTH_SHORT)
        }
    }
}