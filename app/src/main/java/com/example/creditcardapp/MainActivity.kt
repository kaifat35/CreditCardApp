package com.example.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.creditcardapp.ui.theme.CardInfo
import com.example.creditcardapp.ui.theme.CreditCard
import com.example.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreditCardAppTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    DisplayCards()
                }
            }
        }
    }
}
@Composable
fun DisplayCards(){
    val cards = listOf(
        CardInfo(
            cardNumber = "1111 2222 3333 4444",
            cardHolder = "Ivan Ivanov",
            providerImage = R.drawable.ic_mir1,
            backgroundImage = R.drawable.multicolor
        ),
        CardInfo(
            cardNumber = "1111 2222 3333 4444",
            cardHolder = "Petr Petrov",
            providerImage = R.drawable.ic_mir2,
            backgroundImage = R.drawable.purple
        ),
        CardInfo(
            cardNumber = "1111 2222 3333 4444",
            cardHolder = "Pavel Pavlov",
            providerImage = R.drawable.ic_mir1,
            backgroundImage = R.drawable.blur
        ),
        CardInfo(
            cardNumber = "1111 2222 3333 4444",
            cardHolder = "Sidor Sidorov",
            providerImage = R.drawable.ic_mir2,
            backgroundImage = R.drawable.c10
        ),
        CardInfo(
            cardNumber = "1111 2222 3333 4444",
            cardHolder = "Sidor Sidorov",
            providerImage = R.drawable.ic_mir1,
            backgroundImage = R.drawable.greyscale
        )
    )
    LazyColumn (
        modifier =  Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        items(cards){
            card -> CreditCard(cardInfo = card)
        }
    }
}

