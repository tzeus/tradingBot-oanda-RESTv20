package com.tudoreloprisan.tradingAPI.trade;

import java.util.Collection;

public interface TradeManagementProvider<M, N, K> {

	boolean modifyTrade(K accountId, M tradeId, double stopLoss, double takeProfit);

	boolean closeTrade(M tradeId, K accountId);

    Collection<Trade<String, String, String>> getOpenTradesForAccount(String accountId);

    <T> T getTradeForAccount(M tradeId, K accountId);

	Collection<Trade<M, N, K>> getTradesForAccount(K accountId);
}
