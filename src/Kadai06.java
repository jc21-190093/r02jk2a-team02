
public class Kadai06 {

	/**
	 * 課題06
	 * 引数として渡された配列の中で、降順で2番目の値を返す
	 * @param d 数値が入っている配列
	 * @return
	 */
	int get2ndMax(int[] d) {
		if(d == null) {
			return -1;

		}
		if(d.length==0) {
			return -2;
		}
		int intMax2=0;
		int intMax=d[0];
		for(int i=0;i<d.length;i++){
			if(intMax<=d[i]) {
				intMax2=intMax;
				intMax=d[i];
			}
		}
		return intMax2;
	}

}