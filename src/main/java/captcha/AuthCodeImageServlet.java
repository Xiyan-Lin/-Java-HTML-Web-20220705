package captcha;

import java.io.IOException;
import java.util.Random;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// CAPTCHA 圖靈驗正碼
// 1. 自動產出 0000~9999 之間的認證碼圖像(含干擾資訊)
// 2. 並且將該碼存放到 session 屬性中與使用者輸入的驗證碼進行比對
@WebServlet("/captcha/authcodeimage")
public class AuthCodeImageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 產生認證碼
		String authCode = String.format("%04d", new Random().nextInt(10000));
		System.out.printf("authCode: %s\n", authCode);
		
		// 將驗證碼存放在 session 屬性中
		req.getSession().setAttribute("authCode", authCode);
		
		// 產出認證碼圖片串流
		
	}
	
	// 產出認證碼圖片串流
	private BufferedImage getAuthCodeImage(String authCode) {
		return null;
	} 
	
}