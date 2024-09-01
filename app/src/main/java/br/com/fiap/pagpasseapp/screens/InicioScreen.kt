package br.com.fiap.pagpasseapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.pagpasseapp.R

@Composable
fun InicioScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Imagem de fundo
        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription = "Imagem de Fundo",
            contentScale = ContentScale.Crop, // Ajusta a imagem para preencher o espaço
            modifier = Modifier.fillMaxSize() // Preenche todo o espaço disponível
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .offset(x = 6.dp, y = 120.dp)
        ) {
            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(20.dp))
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(vertical = 25.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    "PAG PASSE",
                    color = Color(0xFFF05D23),
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .padding(bottom = 10.dp)
                )
                Text(
                    "-Se não agora, quando?- ",
                    color = Color(0xFFF05D23),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .padding(bottom = 91.dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(bottom = 0.dp, start = 89.dp, end = 89.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                ) {
                    Button(
                        onClick = {
                            navController.navigate("login")
                        },
                        colors = ButtonDefaults.buttonColors(Color(0xFFF05D23)),
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(
                            "ENTRAR",
                            fontSize = 15.sp,
                        )
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(bottom = 0.dp, start = 89.dp, end = 89.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                ) {
                    Button(
                        onClick = {
                            navController.navigate("cadastro")
                        },
                        colors = ButtonDefaults.buttonColors(Color(0xFFF05D23)),
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(
                            "CADASTRAR",
                            fontSize = 15.sp,
                        )
                    }
                }

                //**************TRANSFORMAR EM LINK*********
                Text(
                    "Esqueceu a senha?",
                    color = Color(0xFFF8F4EF),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 305.dp, start = 133.dp)
                )
            }
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//private fun InicioScreenPreview() {
//InicioScreen()
//}
