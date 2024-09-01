package br.com.fiap.pagpasseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.pagpasseapp.screens.CadastroScreen
import br.com.fiap.pagpasseapp.screens.HomeScreen
import br.com.fiap.pagpasseapp.screens.InicioScreen
import br.com.fiap.pagpasseapp.screens.LoginScreen
import br.com.fiap.pagpasseapp.ui.theme.PagPasseAppTheme

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
        PagPasseAppTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "inicio",
                    modifier = Modifier.padding(innerPadding)
                ) {
                    composable(route = "inicio") {
                        InicioScreen(navController)
                    }
                    composable(route = "login") {
                        LoginScreen(navController)
                    }
                    composable(route = "cadastro") {
                        CadastroScreen(navController)
                    }
                    composable(route = "home") {
                        HomeScreen()
                    }
                }
            }
        }
    }
}
}


