import java.time.LocalDateTime;

public class main {
	public static void main (String[] args ) {
		// 初期値
		int a = 0; // ダイスを回した回数
		int t = 0; // ダイスの合計値
		// 初期ダイスを1～9でランダムに設定
		int i = (int )(Math.random()*9+1);
		// 現在日時の取得
		LocalDateTime nowDate = LocalDateTime.now();		
		
		fileLog.main(nowDate + "実施　7が出ると終了\r\n");
		fileLog.main("--------------\r\n");
		
		if ( i == 7) {
			// 1回目で7が出た場合の終了メッセージ
			fileLog.main("１回目で7が出ました。トータル7です\r\n");
			fileLog.main("--------------\r\n");
		} else {
			// 7が出るまでダイスを回すループ処理
			// 合計の数字と回した回数をカウント
			while ( i != 7) {
				++a; // ダイスを回した回数
				i = (int )(Math.random()*9+1);
				fileLog.main("ダイスで出た目：" + i + "\r\n");
				fileLog.main("--------------\r\n");
				t += i; // 合計値更新
			}
			
			// 終了メッセージ
			fileLog.main(a + "回目で7が出ました。トータル" + t +"です\r\n");
			fileLog.main("--------------\r\n");
		}
	}
	// ビルドテスト　３度目
}