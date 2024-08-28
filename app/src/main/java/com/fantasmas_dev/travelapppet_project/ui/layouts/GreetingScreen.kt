package com.fantasmas_dev.travelapppet_project.ui.layouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fantasmas_dev.travelapppet_project.R
import com.fantasmas_dev.travelapppet_project.ui.theme.ButtonBlue
import com.fantasmas_dev.travelapppet_project.ui.theme.Dimens
import com.fantasmas_dev.travelapppet_project.ui.theme.MontserratFont
import com.fantasmas_dev.travelapppet_project.ui.theme.SweetMavkaFont

@Composable
fun GreetingScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.greeting_background_img),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            Text(
                text = "Aspen",
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = Dimens.padding_92dp),
                fontFamily = SweetMavkaFont,
                fontSize = Dimens.font_116sp,
                color = Color.White
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = Dimens.padding_48dp)
            ) {
                Text(
                    text = "Спланирую ваш",
                    fontFamily = MontserratFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = Dimens.font_24sp,
                    color = Color.White
                )
                Text(
                    text = "Великолепный \nОтдых",
                    fontFamily = MontserratFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = Dimens.font_40sp,
                    color = Color.White
                )
                Button(
                    modifier = Modifier
                        .width(310.dp)
                        .padding(top = Dimens.padding_24dp),
                    shape = RoundedCornerShape(Dimens.corner_16dp),
                    colors = ButtonDefaults.buttonColors(containerColor = ButtonBlue),
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = "Иследовать",
                        modifier = Modifier.padding(vertical = 6.dp),
                        fontFamily = MontserratFont,
                        fontWeight = FontWeight.Normal,
                        fontSize = Dimens.font_16sp
                    )
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun PreviewGreetingScreen() {
    GreetingScreen()
}