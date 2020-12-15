
public class Kadai02 {

	/**
	 * 課題02
	 * 文字列の中に、指定されたアルファベットが何文字入っているかを返すメソッド
	 * @param s 文字列
	 * @param c 文字
	 * @return sの中に入っていたcの文字数
	 */
	static int countString(String s,char c) {
		int count=0;
		if(s != null) {
      String upper = String.valueOf(c).toUpperCase();
      String lower = String.valueOf(c).toLowerCase();
			for(int i=0;i<s.length();i++) {
        String x = String.valueOf(s.charAt(i));
				if(upper.equals(x)||lower.equals(x)){
					count++;
				}
			}
		}else {
			return -1;
		  }
		return count;
	  }
}
