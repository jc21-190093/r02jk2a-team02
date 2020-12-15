
public class Kadai03 {

	/**
	 * 課題03
	 * 文字列の中に含まれるアルファベットを調べて、返すメソッド
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char[] CharacterList(String s) {
		char[] c = s.toCharArray();
		String r="";
		for(int i=0;i<c.length;i++) {
			if('a'<=c[i] & c[i]<='z' | 'A'<=c[i] & c[i]<='Z') {
				r+=String.valueOf(c);
			}
		}

		return r.toCharArray();
	}
}
