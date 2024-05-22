package com.example.mvvmnavigation.ui.theme.screens.products

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.R
import com.example.mvvmnavigation.navigation.ROUTE_ABOUT
import com.example.mvvmnavigation.navigation.ROUTE_HOME
import com.example.mvvmnavigation.navigation.ROUTE_LOGIN
import com.example.mvvmnavigation.navigation.ROUTE_PRODUCTS
import com.example.mvvmnavigation.navigation.ROUTE_SIGNUP
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun ProductsScreen(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
                .background(color = colorResource(id = R.color.mywhite))
        ) {
            item {


                Column(
                    modifier = Modifier.fillMaxSize()
                ) {


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .background(color = colorResource(id = R.color.mytheme)),

                        ) {
                        Row(

                        ) {
                            Column(
                                modifier = Modifier.padding(start = 10.dp)
                            ) {


                                IconButton(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME)
                                    },
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                                        contentDescription = "hamburger menu",
                                        tint = Color.White,
                                    )

                                }
                            }
                            Column(
                                modifier = Modifier.padding(top = 15.dp)
                            ) {
                                Text(
                                    text = "ATM Services",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    // Add some padding to separate the text from the icon
                                )
                            }

                        }


                    }



                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {




                        Card (
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),
                            shape = RoundedCornerShape(1.dp),
                            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                            modifier = Modifier
                                .height(100.dp)
                                .fillMaxWidth(0.90f)
                                .padding(top = 30.dp)

                        ){
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp, end = 10.dp),

                                ) {
                                Column (
                                    modifier = Modifier.padding(top = 19.dp, start = 10.dp)
                                ){
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                                        contentDescription = "wallet"

                                    )

                                }
                                Column (
                                    modifier = Modifier.padding(top = 20.dp, start = 10.dp)
                                ){
                                    Text(
                                        text = "Request Card",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,

                                        // Add some padding to separate the text from the icon
                                    )
                                }
                                Spacer(modifier = Modifier.weight(1f))

                                Column (
                                    modifier = Modifier.padding(top = 19.dp, end = 10.dp)
                                ){
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                                        contentDescription = "wallet"

                                    )

                                }

                            }
                        }

                        Card (
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),
                            shape = RoundedCornerShape(1.dp),
                            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                            modifier = Modifier
                                .height(70.dp)
                                .fillMaxWidth(0.90f)
                                .padding(top = 2.dp)

                        ){
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp),

                                ) {
                                Column (
                                    modifier = Modifier.padding(top = 19.dp, start = 10.dp)
                                ){
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                                        contentDescription = "wallet"

                                    )

                                }
                                Column (
                                    modifier = Modifier.padding(top = 20.dp,  start = 10.dp)
                                ){
                                    Text(
                                        text = "Block Card",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,

                                        // Add some padding to separate the text from the icon
                                    )
                                }
                                Spacer(modifier = Modifier.weight(1f))

                                Column (
                                    modifier = Modifier.padding(top = 19.dp, end = 10.dp)
                                ){
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                                        contentDescription = "wallet"

                                    )

                                }
                            }
                        }
                        Card (
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),
                            shape = RoundedCornerShape(1.dp),
                            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                            modifier = Modifier
                                .height(70.dp)
                                .fillMaxWidth(0.90f)
                                .padding(top = 2.dp)

                        ){
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp),

                                ) {
                                Column (
                                    modifier = Modifier.padding(top = 19.dp, start = 10.dp)
                                ){
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                                        contentDescription = "wallet"

                                    )

                                }
                                Column (
                                    modifier = Modifier.padding(top = 20.dp, start = 10.dp)
                                ){
                                    Text(
                                        text = "Replace Card",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black,

                                        // Add some padding to separate the text from the icon
                                    )
                                }
                                Spacer(modifier = Modifier.weight(1f))

                                Column (
                                    modifier = Modifier.padding(top = 19.dp, end = 10.dp)
                                ){
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                                        contentDescription = "wallet"

                                    )

                                }
                            }
                        }






                    }
                }

            }
        }






        BottomAppBar(
            modifier = Modifier
                .background(Color.Transparent)
                .fillMaxWidth()
                .padding(top = 40.dp)
                .align(Alignment.BottomCenter)

        ) {
            IconButton(
                onClick = {
                    navController.navigate(ROUTE_HOME)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_home_24),
                    contentDescription = "home"
                )
//            Icon(imageVector = Icons.Default.home, contentDescription = )
                Text(
                    text = "Home",
                    modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(ROUTE_SIGNUP)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                    contentDescription = "wallet"
                )
                Text(
                    text = "wallet",
                    modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(ROUTE_ABOUT)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24),
                    contentDescription = "p2p"
                )
                Text(
                    text = "p2p",
                    modifier = Modifier.padding(top = 40.dp, bottom = 1.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(ROUTE_LOGIN)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_settings_24),
                    contentDescription = "settings"
                )
                Text(
                    text = "settings",
                    modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                )
            }
        }


    }

}
@Preview(showBackground = true)
@Composable
fun ProductsScreenPreview(){
    MVVMNavigationTheme {
        ProductsScreen(rememberNavController())
    }
}