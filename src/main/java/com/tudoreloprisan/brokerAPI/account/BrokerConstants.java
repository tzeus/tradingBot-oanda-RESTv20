/**
 *  Copyright Murex S.A.S., 2003-2018. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.tudoreloprisan.brokerAPI.account;

import com.tudoreloprisan.tradingAPI.util.TradingConstants;

import org.apache.http.message.BasicHeader;


public final class BrokerConstants {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Static fields/initializers 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static final String TRANSACTIONS = "/transactions";
    public static final String PRICES = "/pricing";
    public static final String PRICES_RESOURCE = "/pricing/stream";
    public static final String INSTRUMENTS_RESOURCE_FOR_CANDLES = "/v3/instruments";
    public static final String INSTRUMENTS_RESOURCE = "/instruments";
    public static final String CANDLES_RESOURCE = "/candles";
    public static final String ACCOUNTS_RESOURCE = "/v3/accounts";
    public static final String ORDERS_RESOURCE = "/orders";
    public static final String ORDER_STATE_PENDING = "PENDING";
    public static final String ORDER_STATE_FILLED = "FILLED";
    public static final String ORDER_STATE_CANCELLED = "CANCELLED";
    public static final String ORDER_STATE_ALL = "ALL";
    public static final String PENDING_ORDERS_RESOURCE = "/pendingOrders";
    public static final String CANCEL_RESOURCE = "/cancel";
    public static final String TRADES_RESOURCE = "/trades";
    public static final String OPEN_TRADES_RESOURCE = "/openTrades";
    public static final String TRADES_CLOSE_RESOURCE = "/close";
    public static final String TRANSACTIONS_RESOURCE = "/transactions/stream";

    public static final double LOT_SIZE = 10000.00;
    public static final String ORDER_MARKET = "MARKET";
    public static final String ORDER_LIMIT = "LIMIT";
    public static final String ORDER_MARKET_IF_TOUCHED = "marketIfTouched";
    public static final String STOP_LOSS = "STOP_LOSS";
    public static final String TAKE_PROFIT = "TAKE_PROFIT";

    public static final BasicHeader UNIX_DATETIME_HEADER = new BasicHeader("X-Accept-Datetime-Format", "UNIX");
    public static final String CCY_PAIR_SEP = TradingConstants.CURRENCY_PAIR_SEP_UNDERSCORE;
    public static final String CCY_PAIR_SEP2 = "/";
    public static final String BUY = "buy";
    public static final String SELL = "sell";
    public static final String NONE = "none";
    public static final String INTEREST = "Interest";
    public static final String BUY_MKT = "Buy Market";
    public static final String SELL_MKT = "Sell Market";

    public static final String CHANGE_TRADE = "Change Trade";
    public static final String CLOSE_TRADE = "Close Trade";
    public static final String TRAILING_STOP = "Trailing Stop";
    public static final String DAILYFX_CALENDAR_URL = "http://www.dailyfx.com/files/Calendar-%tm-%td-%tY.csv";

    public static final String BID_ASK_MID_CANDLESTICKS = "BAM";

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors 
    //~ ----------------------------------------------------------------------------------------------------------------

    private BrokerConstants() {
    }
}
