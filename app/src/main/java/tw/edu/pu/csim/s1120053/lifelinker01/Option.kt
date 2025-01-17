package tw.edu.pu.csim.s1120053.lifelinker01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tw.edu.pu.csim.s1120053.lifelinker01.ui.theme.LifeLinker01Theme

class Option : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeLinker01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Option(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable  //2選項頁
fun Option(modifier: Modifier) {
    val context = LocalContext.current  //取得App的運行環境
    val activity = (context as Activity)  //取得App運行的活動
    Image(
        painter = painterResource(id = R.drawable.bg),
        contentDescription = "bg",
        modifier = Modifier.fillMaxSize()
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Row {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.weelchair),
                        contentDescription = "輪椅",
                        modifier = Modifier
                            .size(150.dp)
//                            .clickable {
//                                val intent = Intent(context, Info::class.java)
//                                context.startActivity(intent)
//                            }
                    )
                    Text(
                        text = "輪椅",
//                        fontFamily = FontFamily(Font(R.font.round)),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .offset(y = (-10).dp)
                    )
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.walkingaid),
                        contentDescription = "助行器",
                        modifier = Modifier
                            .size(150.dp)
//                            .clickable {
//                                val intent = Intent(context, Info::class.java)
//                                context.startActivity(intent)
//                            }
                    )
                    Text(
                        text = "助行器",
//                        fontFamily = FontFamily(Font(R.font.round)),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .offset(y = (-10).dp)
                    )
                }
            }
            Row {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.crutch),
                        contentDescription = "拐杖",
                        modifier = Modifier
                            .size(150.dp)
//                            .clickable {
//                                val intent = Intent(context, Info::class.java)
//                                context.startActivity(intent)
//                            }
                    )
                    Text(
                        text = "拐杖",
//                        fontFamily = FontFamily(Font(R.font.round)),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .offset(y = (-10).dp)
                    )
                }
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.repair),
                        contentDescription = "輪椅",
                        modifier = Modifier
                            .size(150.dp)
//                            .clickable {
//                                val intent = Intent(context, Repair::class.java)
//                                context.startActivity(intent)
//                            }
                    )
                    Text(
                        text = "預約維修",
//                        fontFamily = FontFamily(Font(R.font.round)),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .offset(y = (-15).dp)
                    )
                }
            }
        }
    }
}