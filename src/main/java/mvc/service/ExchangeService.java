package mvc.service;

import mvc.entity.Exchange;
import mvc.repository.ExchangeDao;
import yahoofinance.Stock;

public class ExchangeService {
	
	private ExchangeDao dao = new ExchangeDao();
	
	public Exchange getExchange(Double amount, String from, String to) {
		String symbol = from + to + "=x"; // 組合 symbol
		try {
			Stock stock = dao.get(symbol);
			Exchange exchange = new Exchange();
			exchange.setAmount(amount);
			exchange.setFrom(from);
			exchange.setTo(to);
			double price = stock.getQuote().getPrice().doubleValue(); // 匯率或股價
			exchange.setExchange(price);
			double result = amount * price;  // 換匯結果
			exchange.setResult(result);
			exchange.setDatetime(stock.getQuote().getLastTradeTime().getTime());  // 最後交易時間
			return exchange;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
