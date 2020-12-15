
public class Kadai06 {

	/**
	 * 課題06
	 * 引数として渡された配列の中で、降順で2番目の値を返す
	 * @param d 数値が入っている配列
	 * @return
	 */
	int get2ndMax(int[] d) {
		int intMax2=0;
		int intMax=d[0];

		for(int i=1;i<d.length;i++){
			if(intMax<d[i]) {
				intMax2=intMax;
				intMax=d[i];
			}
		}

		return intMax2;
	}

}