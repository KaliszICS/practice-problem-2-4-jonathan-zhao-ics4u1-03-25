public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages){
		for (int j = 0; j < names.length-1; j++){
			int smallestIndex = j;
			for (int i = j + 1; i < names.length;i++){
				if (names[i].compareToIgnoreCase(names[smallestIndex]) < 0){
					smallestIndex = i;
				}
			}
			String temp = names[smallestIndex];
			int tempAges = ages[smallestIndex];
			ages[smallestIndex] = ages[j];
			ages[j] = tempAges;
			names[smallestIndex] = names[j];
			names[j] = temp;

		}
	}
	
	public static void selectionSortAge(String[] names, int[] ages){
		for (int j = 0; j < ages.length-1; j++){
			int smallestIndex = j;
			for (int i = j + 1; i < ages.length; i++){
				if (ages[i] < ages[smallestIndex]){
					smallestIndex = i;
				}
			}
			String temp = names[smallestIndex];
			int tempAges = ages[smallestIndex];
			ages[smallestIndex] = ages[j];
			ages[j] = tempAges;
			names[smallestIndex] = names[j];
			names[j] = temp;
			
		}
	}
	
	}
	
			

