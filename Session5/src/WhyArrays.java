// When we have lot of data
// Homogeneous Data
public class WhyArrays {

	public static void main(String[] args) {
		
		int popLdh = 20012;
		int popJal = 55613;
		int popAsr = 34551;
		int popFzr = 43621;
		int popBat = 45633;
		
		int punjabPopulation = popLdh + popJal + popAsr + popFzr + popBat;
		System.out.println(">> Population is: "+punjabPopulation);
						//   0       1	   2   	   3      4       5
		int[] population = {20012, 55613, 34551, 71635, 79980, 78654};
		
		// Algo : Give me index of 71635
		
		int count = 0;
		for(int elm : population){
			count = count + elm;
		}
		
		System.out.println(">> Population is: "+count);
		
		for(int i=0;i<population.length;i++){
			if(population[i] == 71635){
				System.out.println("idx is: "+i);
				break;
			}
		}
		
		
		// HW: Find index of min and max value of array :)

	}

}
