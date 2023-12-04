package cat.insvidreres.inf.mvvmfromzero.loginFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import cat.insvidreres.inf.mvvmfromzero.R
import cat.insvidreres.inf.mvvmfromzero.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)

        binding.goToUsersButton.setOnClickListener {
            val user = binding.userEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            val result = viewModel.checkIfLoginCorrect(user, password)

            if (result)
                findNavController().navigate(R.id.action_loginFragment_to_usersFragment, null)
            else
                Toast.makeText(requireContext(), "Error in your credentials", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

}