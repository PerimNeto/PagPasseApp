package br.com.fiap.pagpasseapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.text.input.PasswordVisualTransformation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroScreen(navController: NavController) {
val nomeValue = remember { mutableStateOf("") }
val cpfValue = remember { mutableStateOf("") }
val telefoneValue = remember { mutableStateOf("") }
val emailValue = remember { mutableStateOf("") }
val senhaValue = remember { mutableStateOf("") }
val repitaValue = remember { mutableStateOf("") }
val dtnascValue = remember { mutableStateOf("") }
val inputBackgroundColor = Color(0xFFF05D23) // Cor do botão
Column(
    modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color(0xFFAC3B9FF))
        .verticalScroll(rememberScrollState())
        .offset(x = 6.dp, y = 100.dp)
){

    Column(
        modifier = Modifier
            .padding(bottom = 22.dp, start = 37.dp, end = 37.dp,)
            .border(
                width = 2.dp,
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
    )
    {
        TextField(
            value = nomeValue.value,
            onValueChange = { nomeValue.value = it },
            label = { Text("Nome", color = Color.White) }, // Cor do texto do label
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
            .border(
                width = 2.dp,
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )

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
            .border(
                width = 2.dp,
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
    )
    {
        TextField(
            value = telefoneValue.value,
            onValueChange = { telefoneValue.value = it },
            label = { Text("Telefone", color = Color.White) }, // Cor do texto do label
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
            .border(
                width = 2.dp,
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
    )
    {
        TextField(
            value = emailValue.value,
            onValueChange = { emailValue.value = it },
            label = { Text("E-mail", color = Color.White) }, // Cor do texto do label
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
            .border(
                width = 2.dp,
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
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
        modifier = Modifier
            .padding(bottom = 28.dp, start = 37.dp, end = 37.dp,)
            .border(
                width = 2.dp,
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
    )
    {
        TextField(
            value = repitaValue.value,
            onValueChange = { repitaValue.value = it },
            label = { Text("Repita a Senha", color = Color.White) }, // Cor do texto do label
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
        modifier = Modifier
            .padding(bottom = 28.dp, start = 37.dp, end = 37.dp,)
            .border(
                width = 2.dp,
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
            .clip(shape = RoundedCornerShape(21.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(21.dp)
            )
    )
    {
        TextField(
            value = dtnascValue.value,
            onValueChange = { dtnascValue.value = it },
            label = { Text("Data de Nascimento", color = Color.White) }, // Cor do texto do label
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
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 23.dp, start = 89.dp, end = 89.dp,)
            .clip(shape = RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .padding(vertical = 16.dp,)
    ){
        Button(
            onClick = {
                navController.navigate("login")
            },
            colors = ButtonDefaults.buttonColors(Color(0xFFF05D23))
        )
        {
            Text("CADASTRAR",
                fontSize = 15.sp,
            )

        }

    }

}
}


//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//private fun CadastroScreenPreview() {
//    CadastroScreen()
//
//}

