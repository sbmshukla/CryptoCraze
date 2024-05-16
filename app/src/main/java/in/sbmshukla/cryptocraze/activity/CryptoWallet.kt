package `in`.sbmshukla.cryptocraze.activity

data class CryptoWallet(
    val cryptoSymbol: String,
    val picUrl: String,
    val changePercent: Double,
    val propertyAmount: Double,
    val cryptoBalance: Double
)