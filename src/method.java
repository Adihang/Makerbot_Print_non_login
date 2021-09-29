import java.io.FileWriter;
import java.io.IOException;
import java.net.URI; 
import java.net.URISyntaxException; 
import java.awt.Desktop;
import javax.swing.JOptionPane;

public class method {
	public static void main(String[] args) {
		String users = System.getProperty("user.home");
		String user = users.substring(9);

		String txt = "{" + "\"converterConfig\"" + ": {" + "\"no_structure_formats\"" + ": [" + "\"stl\"" + ","
				+ "\"wrl\"" + "," + "\"obj\"" + "]," + "\"no_stl_formats\"" + ": [" + "\"stl\"" + "],"
				+ "\"extension_units\"" + ": {}," + "\"supported_representations\"" + ": [" + "\"stl\"" + ","
				+ "\"wrl\"" + "] }," + "\"myPrinters\"" + ": [], " + "\"lastSelectedPrinter\"" + ":" + "\"\"" + ","
				+ "\"isIntegratedCard\"" + ": true," + "\"appWinState\"" + ": {" + "\"width\"" + ": 1200,"
				+ "\"height\"" + ": 800," + "\"maximized\"" + ": false}," + "\"makerbot\"" + ": {" + "\"requireLogin\""
				+ ": false}}";

		String file = "C:\\Users\\" + user + "\\AppData\\Roaming\\Makerbot\\MakerbotPrint\\user_config.json";

		try {
			FileWriter fw = new FileWriter(file);
			fw.write(txt);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(
				"설치 완료\n\n이 소프트웨어는 인터넷을 사용하지 못하는 사용자를 위해\nMakerbot Print를 로그인을 하지않고 사용할수 있게 제작되었습니다.\n\n아디항의 IT저장소\nMakerbot_Print_non_login ver 0.1");
		JOptionPane.showMessageDialog(null,
				"설치 완료\n\n이 소프트웨어는 인터넷을 사용하지 못하는 사용자를 위해\nMakerbot Print를 로그인을 하지않고 사용할수 있게 제작되었습니다.\n\n아디항의 IT저장소\nMakerbot_Print_non_login ver 0.1",
				"Makerbot Print non login", JOptionPane.PLAIN_MESSAGE);
		try {
				Desktop.getDesktop().browse(new URI("https://blog.naver.com/limhan456"));
			} catch (IOException e) 
		{ e.printStackTrace(); 
			} catch (URISyntaxException e) 
		{ e.printStackTrace(); 
		}
	}
}