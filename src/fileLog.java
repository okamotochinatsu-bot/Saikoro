import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileLog {
	/**
	 * テキストファイルに追記
	 * @param text
	 */
	public static void main (String text) {
		try {
			// ファイル設定
			File file = new File("C:\\pleiades\\2024-09\\workspace\\Saikoro\\text\\text.txt");
			FileWriter filewriter = new FileWriter(file, true);
			// 書き込み
			filewriter.write(text);
			// ファイル閉じる
			filewriter.close();
			System.out.println("Textファイル書き込み完了");
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("ファイルに書き込めません");
		}
	}
	
	/**
	 * テキストファイルに上書き
	 * @param text
	 */
	public static void fileWriterUwagaki (String text) {
		try {
			// ファイル設定
			File file = new File("c:\\tmp\\test.txt");
			FileWriter filewriter = new FileWriter(file);
			// 書き込み
			filewriter.write(text);
			// ファイル閉じる
			filewriter.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
