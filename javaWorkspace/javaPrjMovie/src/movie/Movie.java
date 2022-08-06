package movie;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Movie {
	Scanner sc = new Scanner(System.in);

	public void movieReg() throws IOException {
        
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■              3.영화 선택              ■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("1) 토르: 러브 앤 썬더 (Thor: Love and Thunder)");
		System.out.println("2) 탑건: 매버릭 (Top Gun: Maverick)");
		System.out.println("3) 헤어질 결심 (Decision To Leave)");
		System.out.println("4) 범죄도시 2 (the roundup)");
		System.out.println("5) 버즈 라이트이어 (Lightyear)");
		System.out.println("");
		System.out.println("▶ 예매하려는 영화 번호를 입력해 주세요 : ");
		int movieNum = sc.nextInt();
		if(movieNum == 1) {
			System.out.println("▷ 토르: 러브 앤 썬더 (Thor: Love and Thunder) 가 선택되었습니다.");
	        File movieFile = new File("C:\\Users\\annie\\Desktop\\MovieImage\\Thor-Love and Thunder.jpg");
	        BufferedImage bufferedImage = ImageIO.read(movieFile);
	        ImageIcon imageIcon = new ImageIcon(bufferedImage);
	        JFrame jFrame = new JFrame();

	        jFrame.setLayout(new FlowLayout());
	        
	        jFrame.setSize(500, 500);
	        JLabel jLabel = new JLabel();

	        jLabel.setIcon(imageIcon);
	        jFrame.add(jLabel);
	        jFrame.setVisible(true);

	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}else if(movieNum == 2) {
			System.out.println("▷ 탑건: 매버릭 (Top Gun: Maverick) 가 선택되었습니다.");
	        File movieFile = new File("C:\\Users\\annie\\Desktop\\MovieImage\\Top Gun-Maverick.jpg");
	        BufferedImage bufferedImage = ImageIO.read(movieFile);
	        ImageIcon imageIcon = new ImageIcon(bufferedImage);
	        JFrame jFrame = new JFrame();

	        jFrame.setLayout(new FlowLayout());
	        
	        jFrame.setSize(500, 500);
	        JLabel jLabel = new JLabel();

	        jLabel.setIcon(imageIcon);
	        jFrame.add(jLabel);
	        jFrame.setVisible(true);

	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}else if(movieNum == 3) {
			System.out.println("▷ 헤어질 결심 (Decision To Leave) 가 선택되었습니다.");
	        File movieFile = new File("C:\\Users\\annie\\Desktop\\MovieImage\\Decision To Leave.jpg");
	        BufferedImage bufferedImage = ImageIO.read(movieFile);
	        ImageIcon imageIcon = new ImageIcon(bufferedImage);
	        JFrame jFrame = new JFrame();

	        jFrame.setLayout(new FlowLayout());
	        
	        jFrame.setSize(500, 500);
	        JLabel jLabel = new JLabel();

	        jLabel.setIcon(imageIcon);
	        jFrame.add(jLabel);
	        jFrame.setVisible(true);

	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}else if(movieNum == 4) {
			System.out.println("▷ 범죄도시 2 (the roundup) 가 선택되었습니다.");
	        File movieFile = new File("C:\\Users\\annie\\Desktop\\MovieImage\\the roundup.jpg");
	        BufferedImage bufferedImage = ImageIO.read(movieFile);
	        ImageIcon imageIcon = new ImageIcon(bufferedImage);
	        JFrame jFrame = new JFrame();

	        jFrame.setLayout(new FlowLayout());
	        
	        jFrame.setSize(500, 500);
	        JLabel jLabel = new JLabel();

	        jLabel.setIcon(imageIcon);
	        jFrame.add(jLabel);
	        jFrame.setVisible(true);

	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}else if(movieNum == 5) {
			System.out.println("▷ 버즈 라이트이어 (Lightyear) 가 선택되었습니다.");
	        File movieFile = new File("C:\\Users\\annie\\Desktop\\MovieImage\\Lightyear.jpg");
	        BufferedImage bufferedImage = ImageIO.read(movieFile);
	        ImageIcon imageIcon = new ImageIcon(bufferedImage);
	        JFrame jFrame = new JFrame();

	        jFrame.setLayout(new FlowLayout());
	        
	        jFrame.setSize(500, 500);
	        JLabel jLabel = new JLabel();

	        jLabel.setIcon(imageIcon);
	        jFrame.add(jLabel);
	        jFrame.setVisible(true);

	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
	}

}
