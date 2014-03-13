package jp.leve_five.careerup.sample;

public class PrimeNumbers {
    private int count;

//	public int getCount(int number) {
//		if(number > 3){
//			count ++;
//			for(int i=0 ; i < number ; i++){
//				if(i%6 == 1 || i%6 ==5){
//					count ++;
//				}
//				continue;
//			}
//			System.out.println(count);
//			return count;
//		}
//		System.out.println(count);
//		return 0;
//	}
    public int getCount(int number){
    		if(number > 3){
    			for(int i=3 ; i < number ; i++){
    				for(int j=2 ; j < i ; j++){
    					count ++;
    					if(i%j == 0){
    						break;
    					}
    				    count--;
    				}	
    			}
    			number -= (count+2);
    			System.out.println(number);
    			return number;		
    		}else if(number == 3){
    			return 1;
    		}
    		return 0;
    }
}
