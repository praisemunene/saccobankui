package com.example.mvvmnavigation.ui.theme.screens.home

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.R
import com.example.mvvmnavigation.navigation.ROUTE_ABOUT
import com.example.mvvmnavigation.navigation.ROUTE_HOME
import com.example.mvvmnavigation.navigation.ROUTE_LOANS
import com.example.mvvmnavigation.navigation.ROUTE_LOGIN
import com.example.mvvmnavigation.navigation.ROUTE_PRODUCTS
import com.example.mvvmnavigation.navigation.ROUTE_SIGNUP
import com.example.mvvmnavigation.navigation.ROUTE_STATEMENT
import com.example.mvvmnavigation.navigation.ROUTE_TRANSFER
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun HomeScreen(navController: NavController){

    val context = LocalContext.current




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
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
                .background(color = colorResource(id = R.color.mywhite))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(color = colorResource(id = R.color.mytheme)),

                ) {
                Column(
                    modifier = Modifier.padding(all = 10.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_density_medium_24),
                        contentDescription = "hamburger menu",
                        tint = Color.White,


                        )
                }

            }

            Column(
                modifier = Modifier
                    .height(20.dp)
                    .background(color = colorResource(id = R.color.mywhite))
            ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            navController.navigate(ROUTE_LOGIN)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = colorResource(id = R.color.black)),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_balance_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Balance Enquiry",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )


                        }

                    }

                }

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            navController.navigate(ROUTE_ABOUT)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = colorResource(id = R.color.binancered)),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Withdraw",
                                        fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }
            }
            Column(
                modifier = Modifier
                    .height(10.dp)
                    .background(color = colorResource(id = R.color.mywhite))
            ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            navController.navigate(ROUTE_STATEMENT)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = Color.Red),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_assignment_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Mini Statements",
                                        fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            navController.navigate(ROUTE_TRANSFER)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = Color.Green),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_autorenew_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Funds Transfer",
                                        fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }
            }

            Column(
                modifier = Modifier
                    .height(10.dp)
                    .background(color = colorResource(id = R.color.mywhite))
            ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            navController.navigate(ROUTE_LOANS)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = Color.Blue),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_phone_android_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Loans",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            navController.navigate(ROUTE_SIGNUP)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(colorResource(id = R.color.mygreen)),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_add_to_home_screen_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Deposit From Mpesa",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }
            }
            Column(
                modifier = Modifier
                    .height(10.dp)
                    .background(color = colorResource(id = R.color.mywhite))
            ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = Color.Yellow),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_phone_android_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Buy Airtime",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = Color.Blue),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_attach_money_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Cheques",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }
            }
            Column(
                modifier = Modifier
                    .height(10.dp)
                    .background(color = colorResource(id = R.color.mywhite))
            ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            navController.navigate(ROUTE_PRODUCTS)
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(colorResource(id = R.color.binancered)),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_assured_workload_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "ATM",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                    }

                }

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(130.dp)
                        .weight(0.9f)
                        .clickable {
                            Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
                        }
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(60.dp)
                                    .clip(CircleShape)
                                    .height(60.dp)
                                    .background(color = colorResource(id = R.color.binanceyellow)),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_apps_24),
                                    contentDescription = "phone",
                                    tint = Color.White,

                                    )
                            }
                            Text(
                                text = "Utility Bills",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
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
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
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
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
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
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
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
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                    )
                }
            }

        }
}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    MVVMNavigationTheme {
        HomeScreen(rememberNavController())
    }
}