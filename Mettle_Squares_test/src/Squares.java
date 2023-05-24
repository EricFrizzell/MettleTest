    import java.util.ArrayList;
	import java.util.List;
	import java.util.Collections;
	

	

	public class Squares {
	    public static void main(String[] args) {
	        List<Integer> inputList = new ArrayList<>();
	        inputList.add(1);
	        inputList.add(33);
	        inputList.add(4);
	        inputList.add(16);
	        inputList.add(9);
	        inputList.add(55);
	        inputList.add(2);
	        
	        List<Integer> perfectSquareList = findPerfectSquares(inputList);
	        
	        System.out.println("List of perfect squares:");
	        for (int num : perfectSquareList) {
	            System.out.println(num);
	        }
	    }
	    
	    public static List<Integer> findPerfectSquares(List<Integer> inputList) {
	        List<Integer> perfectSquareList = new ArrayList<>();
	        
	        for (int num : inputList) {
	            double squareRoot = Math.sqrt(num);
	            if (squareRoot == Math.floor(squareRoot)) {
	                perfectSquareList.add(num);
	                Collections.sort(perfectSquareList);
	            }
	        }
	        
	        return perfectSquareList;
	    }
	}


