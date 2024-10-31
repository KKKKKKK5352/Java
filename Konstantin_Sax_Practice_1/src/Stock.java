class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;

    Stock(String newSymbol, String newName) {
        symbol = newSymbol; name = newName;
    }

    double getChangePercent() {
        double result = currentPrice - previousClosingPrice;
        return result / (currentPrice + previousClosingPrice) / 2;
    }
}