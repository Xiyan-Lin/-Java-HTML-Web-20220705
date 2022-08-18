package websocket;

import java.util.concurrent.CopyOnWriteArrayList;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket_endpoint")
public class WebSocketEndpoint {
	// 用來存放給一個 Client 端的 Session 連線物件
	private static CopyOnWriteArrayList<Session> sessions = new CopyOnWriteArrayList<>();
	
	
	@OnOpen // 建立連線
	public void onOpen(Session session) {
		// 紀錄連線資訊
		System.out.println("有新的連線進來: " + session.getId());
		// 將 session 物件存入到 sessions 集合中
		sessions.add(session);
		// 顯示目前連線數量
		System.out.println("目前連線數量: " + sessions.size());
		// 群播資訊: 報告大家說有新的人連線進來了
		String message = "有新成員加入, 目前人數: " + sessions.size();
		// 進行群播
		for(Session s : sessions) {
			if(s.isOpen()) {
				s.getAsyncRemote().sendText(message);
			}
		}
	}
	
	@OnMessage // 傳送訊息
	public void onMessage(String message, Session session) {
		
	}
	
	@OnClose // 關閉連線
	public void onClose(Session session) {
		
		
	}
	
	
}
