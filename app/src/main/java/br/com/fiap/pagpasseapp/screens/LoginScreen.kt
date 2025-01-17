package br.com.fiap.pagpasseapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
val cpfValue = remember { mutableStateOf("") }
val senhaValue = remember { mutableStateOf("") }
val inputBackgroundColor = Color(0xFFF05D23) // Cor do botão
Column(
    modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color(0xFFAC3B9FF))
        .padding(vertical = 18.dp,)
        .verticalScroll(rememberScrollState())
        .offset(x = 6.dp, y = 120.dp)
){

    Text("PAG PASSE",
        color = Color(0xFFF05D23),
        fontSize = 45.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .align(CenterHorizontally)
            .padding(bottom = 10.dp)
    )
    Text("-Se não agora, quando?- ",
        color = Color(0xFFF05D23),
        fontSize = 15.sp,
        modifier = Modifier
            .align(CenterHorizontally)
            .padding(bottom = 91.dp)


    )
    Column(
        modifier = Modifier
            .padding(bottom = 22.dp, start = 37.dp, end = 37.dp,)
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .padding(vertical = 17.dp, horizontal = 32.dp,)
    )
    {
        TextField(
            value = cpfValue.value,
            onValueChange = { cpfValue.value = it },
            label = { Text("CPF", color = Color.White) }, // Cor do texto do label
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFFF8F4EF),
                containerColor = inputBackgroundColor, // Fundo igual ao botão
                focusedIndicatorColor = Color.Transparent, // Remover a linha inferior ao focar
                unfocusedIndicatorColor = Color.Transparent, // Remover a linha inferior ao desfocar
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
    Column(
        modifier = Modifier
            .padding(bottom = 28.dp, start = 37.dp, end = 37.dp,)
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .padding(vertical = 15.dp, horizontal = 29.dp,)
    )
    {
        TextField(
            value = senhaValue.value,
            onValueChange = { senhaValue.value = it },
            label = { Text("Senha", color = Color.White) }, // Cor do texto do label
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFFF8F4EF),
                containerColor = inputBackgroundColor, // Fundo igual ao botão
                focusedIndicatorColor = Color.Transparent, // Remover a linha inferior ao focar
                unfocusedIndicatorColor = Color.Transparent, // Remover a linha inferior ao desfocar
            ),
            visualTransformation = PasswordVisualTransformation(), // Mascara para senha
            modifier = Modifier.fillMaxWidth()
        )
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 23.dp, start = 89.dp, end = 89.dp,)
            .clip(shape = RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .padding(vertical = 16.dp,)
    ){
        Button(
            onClick = {
                navController.navigate("home")
            },
            colors = ButtonDefaults.buttonColors(Color(0xFFF05D23))
        )
        {
            Text("ENTRAR",
                fontSize = 15.sp,
            )
        }

    }
    Column(
        modifier = Modifier
            .padding(bottom = 12.dp, start = 95.dp, end = 95.dp,)
            .height(1.dp)
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
            )
    ){
    }

    //**************TRANSFORMAR EM LINK*********
    Text("Esqueceu a senha?",
        color = Color(0xFFF8F4EF),
        fontSize = 15.sp,
        modifier = Modifier
            .padding(bottom = 305.dp,start = 133.dp,)
    )
}
}


//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//private fun LoginScreenPreview() {
//    LoginScreen()
//
//}

