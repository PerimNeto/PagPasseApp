package br.com.fiap.pagpasseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.pagpasseapp.ui.theme.PagPasseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PagPasseAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ColumnRowScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(Color(0xFFAC3B9FF))
                    )
                }
            }
        }
    }

    @Composable
    fun ColumnRowScreen(modifier: Modifier = Modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xFFAC3B9FF))
                .offset(x = 6.dp, y = 120.dp)

        ){
            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(20.dp))
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFFAC3B9FF))
                    .padding(vertical = 25.dp,)
                    .verticalScroll(rememberScrollState())
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
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(bottom = 0.dp, start = 89.dp, end = 89.dp,)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .fillMaxWidth()
                        .padding(vertical = 16.dp,)
                        .background(Color(0xFFAC3B9FF))
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0xFFF05D23)),
                        modifier = Modifier.width(150.dp)

                    )
                    {
                        Text("ENTRAR",
                            fontSize = 15.sp,

                        )

                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(bottom = 0.dp, start = 89.dp, end = 89.dp,)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .fillMaxWidth()
                        .padding(vertical = 16.dp,)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0xFFF05D23)),
                        modifier = Modifier.width(150.dp)
                    )
                    {
                        Text("CADASTRAR",
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
                Text("Esqueceu a senha?",
                    color = Color(0xFFF8F4EF),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 305.dp,start = 133.dp,)
                )
            }
        }
    }


    @Preview(showSystemUi = true, showBackground = true)
    @Composable
    private fun ColumnRowScreenPreview() {
        ColumnRowScreen()
    }

}