import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class APPhoto {

	public static void main(String[] args) {
		URL url;
		File targetFile;
		for (int i = 714; i < 1381; i++) {
			try {
				String mssv = "PK" + String.format("%05d", i);
				url = new URL("http://ap.poly.edu.vn/user/pk/" + mssv + ".png");
				String fileName = mssv + ".png";
				targetFile = new File("output/" + fileName);
				FileUtils.copyURLToFile(url, targetFile, 5000, 5000);
				System.out.println("download " + mssv + ".png successfuly!");
				//Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("<---------- Skipped ------->");
			}
		}
	}
}
