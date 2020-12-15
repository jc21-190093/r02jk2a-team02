public class Kadai01 {

	/**
	 * 課題01
	 * 文字列の左右の文字を反転して返すメソッド
	 * @param s　対象の文字
	 * @return 左右を反転した結果
	 */

		 		 String reverse(String s) {
		 			 if(s!=null) {
		 			if(s.length()>0) {
		 				s = reverse(s.substring(1))+s.substring(0, 1);
		 			}
		 			 }
		 			return s;
		 		}

}