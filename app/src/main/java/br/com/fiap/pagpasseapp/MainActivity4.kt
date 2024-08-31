package br.com.fiap.pagpasseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.pagpasseapp.ui.theme.PagPasseAppTheme

class MainActivity4 : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
        PagPasseAppTheme {
            Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                ColumnRowScreen(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxWidth()
                        .height(300.dp)
                )
            }
        }
    }
}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColumnRowScreen(modifier: Modifier = Modifier) {
    val valorValue = remember { mutableStateOf("") }
    val inputBackgroundColor = Color(0xFFF05D23) // Cor do botão
Column(
    modifier = Modifier
        .fillMaxWidth()
        .background(
            color = Color(0xFFC3B9FF),
        )
        .padding(vertical = 17.dp,)
        .verticalScroll(rememberScrollState())
){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(bottom = 10.dp,start = 36.dp,end = 36.dp,)
            .fillMaxWidth()
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 3.dp,)
                .clip(shape = RoundedCornerShape(100.dp))
                .width(184.dp)
                .background(
                    color = Color(0xFFF05D23),
                    shape = RoundedCornerShape(100.dp)
                )
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x40000000),
                )
        ){
            //***************************IMAGEM DE PERFIL***************************

            //CoilImage(
            //    imageModel = {"https://i.imgur.com/1tMFzp8.png"},
             //   imageOptions = ImageOptions(contentScale = ContentScale.Crop),
            //    modifier = Modifier
            //        .padding(end = 15.dp,)
             //       .width(53.dp)
            //        .height(53.dp)
            //)
            Text("Olá, Fernanda",
                color = Color(0xFFFFFFFF),
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(7.dp)
            )
        }
        //****************************IMAGEM DO BOTAO VOLTAR***************************
        //CoilImage(
        //    imageModel = {"https://i.imgur.com/1tMFzp8.png"},
        //    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
       //     modifier = Modifier
        //        .width(25.dp)
        //        .height(23.dp)
      // )
    }
    //****************************IMAGEM DO CARTÃO***************************

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Imagem de fundo
        Image(
            painter = painterResource(id = R.drawable.cartao),
            contentDescription = "Imagem de Fundo",
            contentScale = ContentScale.Crop, // Ajusta a imagem para preencher o espaço
            modifier = Modifier
                .padding(bottom = 5.dp,start = 34.dp,end = 34.dp,)
                .clip(shape = RoundedCornerShape(20.dp))
                .height(180.dp)
                .fillMaxWidth()
        )}
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 7.dp,start = 110.dp,end = 110.dp,)
            .clip(shape = RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(16.dp)
            )

    ){
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xFFF05D23)),
            modifier = Modifier.width(200.dp)
        ) {
            Text(
                "Tarifa Transporte",
                fontSize = 15.sp,
            )
        }

    }
    Text("Extrato",
        color = Color(0xFF252323),
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(bottom = 20.dp,start = 161.dp,)
    )
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = 7.dp,start = 49.dp,end = 49.dp,)
            .fillMaxWidth()
    ){
        Text("25/07/204",
            color = Color(0xFF252323),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
        Text("R$12,00",
            color = Color(0xFF252323),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = 17.dp,start = 50.dp,end = 50.dp,)
            .fillMaxWidth()
    ){
        Text("26/07/204",
            color = Color(0xFF252323),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
        Text("-R$10,00",
            color = Color(0xFF252323),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 7.dp,start = 110.dp,end = 110.dp,)
            .clip(shape = RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .background(
                color = Color(0xFFF05D23),
                shape = RoundedCornerShape(16.dp)
            )
    ){
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xFFF05D23)),
            modifier = Modifier.width(200.dp)
        ) {
            Text(
                "Mais Detalhes",
                fontSize = 15.sp,
            )
        }
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = 23.dp,start = 51.dp,end = 51.dp,)
            .fillMaxWidth()
    ){
        Text("Total",
            color = Color(0xFF252323),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
        Text("R$2,00",
            color = Color(0xFF252323),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
    }
    Text("Depositar",
        color = Color(0xFF252323),
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(bottom = 20.dp,start = 150.dp,)
    )
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

    ){
        TextField(
            value = valorValue.value,
            onValueChange = { valorValue.value = it },
            label = { Text("Valor", color = Color.White) }, // Cor do texto do label
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFFF8F4EF),
                containerColor = inputBackgroundColor, // Fundo igual ao botão
                focusedIndicatorColor = Color.Transparent, // Remover a linha inferior ao focar
                unfocusedIndicatorColor = Color.Transparent, // Remover a linha inferior ao desfocar
            ),
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 15.dp)

        )
    }
    Column(
        modifier = Modifier
            .padding(bottom = 1.dp, start = 37.dp, end = 37.dp,)
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
            .padding(vertical = 10.dp, horizontal = 32.dp,)
    ){
        Text("Código pix copia e cola",
            color = Color(0xFFF8F4EF),
            fontSize = 15.sp,
            modifier = Modifier
                .padding(bottom = 9.dp,start = 54.dp,)
        )
        Text("E12H59PG13A",
            color = Color(0xFFF8F4EF),
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 77.dp,)
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
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xFFF05D23))
        )
        {
            Text("COPIAR",
                fontSize = 15.sp,
            )

        }

    }

}
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnRowScreenPreview() {
ColumnRowScreen()

}